package MidExamPrevPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> productsList = Arrays.stream(sc.nextLine().split("!")).collect(Collectors.toList());
        String input = sc.nextLine();
        while(!input.equals("Go Shopping!")){
            String[] commandArr = input.split(" ");
            switch (commandArr[0]){
                case"Urgent":
                    String itemToAdd = commandArr[1];
                    if(!productsList.contains(itemToAdd)){
                        productsList.add(0,itemToAdd);
                    }
                    break;
                case"Unnecessary":
                    String itemToRemove = commandArr[1];
                    if(productsList.contains(itemToRemove)){
                        productsList.remove(itemToRemove);
                    }
                    break;
                case"Correct":
                    String oldItem = commandArr[1];
                    String newItem = commandArr[2];
                    if(productsList.contains(oldItem)){
                        productsList.set(productsList.indexOf(oldItem),newItem);
                    }
                    break;
                case"Rearrange":
                    String itemToRearrange = commandArr[1];
                    if(productsList.contains(itemToRearrange)){
                        String temp = itemToRearrange;
                        productsList.remove(itemToRearrange);
                        productsList.add(productsList.size(),temp);
                    }
                    break;
            }

            input = sc.nextLine();
        }
        for(int i=0; i<productsList.size();i++){
            if(i!=productsList.size()-1) {
                System.out.print(productsList.get(i) + ", ");
            }
            else{
                System.out.print(productsList.get(i));
            }
        }
    }
}
