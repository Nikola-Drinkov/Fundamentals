package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();

        int size = Math.min(firstList.size(), secondList.size());
        for(int i=0; i<size;i++){
            result.add(firstList.get(i));
            result.add(secondList.get(i));
        }
        if(firstList.size()>secondList.size())
            result.addAll(firstList.subList(size, firstList.size()));

        else result.addAll(secondList.subList(size, secondList.size()));

        for(int item:result){
            System.out.print(item+" ");
        }
    }
}
