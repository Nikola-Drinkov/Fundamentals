package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pokemon_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> distancesList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sumRemoved=0;
        while(distancesList.size()>0){
            int index = Integer.parseInt(sc.nextLine());
            if(index>=0&&index<distancesList.size()) {
                int itemToRemove = distancesList.get(index);
                sumRemoved+=itemToRemove;
                distancesList.remove(index);
                modifyList(distancesList,itemToRemove);

            }
            else if(index<0){
                int itemToRemove = distancesList.get(0);
                sumRemoved+=itemToRemove;
                distancesList.remove(0);
                distancesList.add(0, distancesList.get(distancesList.size()-1));
                modifyList(distancesList,itemToRemove);

            }
            else {
                int itemToRemove = distancesList.get(distancesList.size()-1);
                sumRemoved+=itemToRemove;
                distancesList.remove(distancesList.size()-1);
                distancesList.add(distancesList.size(), distancesList.get(0));
                modifyList(distancesList,itemToRemove);
            }
        }
        System.out.println(sumRemoved);
    }
    public static void modifyList(List<Integer> distancesList, int itemToRemove){
        for (int i = 0; i < distancesList.size(); i++) {
            int currentNum = distancesList.get(i);
            if (currentNum <= itemToRemove) {
                currentNum+=itemToRemove;
            }
            else  {
                currentNum-=itemToRemove;
            }
            distancesList.set(i,currentNum);
        }
    }
}
