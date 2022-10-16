package Lists_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> elementsList = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        List<String> dataList = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        String bombNumber = dataList.get(0);
        int power = Integer.parseInt(dataList.get(1));
        int sum=0;

        while(elementsList.contains(bombNumber)){
            int elementIndex = elementsList.indexOf(bombNumber);

            int left = Math.max(0,elementIndex-power);
            int right = Math.min(elementIndex+power, elementsList.size()-1);
            for(int i=right; i>=left;i--){
                elementsList.remove(i);
            }
        }
        System.out.println(elementsList.stream().mapToInt(Integer::parseInt).sum());
    }
}
