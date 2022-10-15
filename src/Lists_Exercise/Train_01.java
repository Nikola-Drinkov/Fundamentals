package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> wagonList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int wagonCapacity = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        while(!input.equals("end")){
            String [] command = input.split(" ");
            if(command[0].equals("Add")){
                int wagonToAdd = Integer.parseInt(command[1]);
                wagonList.add(wagonToAdd);
            }
            else{
                int passengersToFit = Integer.parseInt(command[0]);
                for (int i=0; i<wagonList.size();i++){
                    if(wagonList.get(i)+passengersToFit<=wagonCapacity){
                        wagonList.set(i,wagonList.get(i)+passengersToFit);
                        break;
                    }
                }
            }
            input= sc.nextLine();
        }
        for(int wagon:wagonList){
            System.out.print(wagon+" ");
        }
    }
}
