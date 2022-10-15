package Lists_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = sc.nextLine();
        while(!input.equals("end")){
            String [] command = input.split(" ");
            switch (command[0]){
                case "Delete":
                    int elementsToDelete = Integer.parseInt(command[1]);
                    numbersList.removeAll(Collections.singletonList(elementsToDelete));
                    break;
                case"Insert":
                    int itemToInsert = Integer.parseInt(command[1]);
                    int position = Integer.parseInt(command[2]);
                    numbersList.add(position,itemToInsert);
                    break;
            }

            input = sc.nextLine();
        }
        for(int item:numbersList){
            System.out.print(item+" ");
        }
    }
}
