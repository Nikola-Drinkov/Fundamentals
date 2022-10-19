package MidExamPrevPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> itemslist = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        String input = sc.nextLine();
        while(!input.equals("Craft!")){
            String [] command = input.split(" - ");
            switch (command[0]){
                case"Collect":
                    String itemToAdd = command[1];
                    if(!itemslist.contains(itemToAdd)){
                        itemslist.add(itemToAdd);
                    }
                    break;
                case"Drop":
                    String itemToDrop = command[1];
                    itemslist.remove(itemToDrop);
                    break;
                case"Combine Items":
                    String [] items = command[1].split(":");
                    String oldItem = items[0];
                    String newItem = items[1];
                    if(itemslist.contains(oldItem)){
                        int indexToAdd = itemslist.indexOf(oldItem);
                        itemslist.add(indexToAdd+1,newItem);
                    }
                    break;
                case"Renew":
                    String itemToRenew = command[1];
                    if(itemslist.contains(itemToRenew)){
                        itemslist.remove(itemToRenew);
                        itemslist.add(itemToRenew);

                    }
                    break;
            }
            input = sc.nextLine();
        }
        System.out.println(String.join(", ",itemslist));
    }
}
