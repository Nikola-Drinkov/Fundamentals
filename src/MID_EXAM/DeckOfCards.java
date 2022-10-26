package MID_EXAM;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> cardsList = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++){
            String input = sc.nextLine();
            String [] command = input.split(", ");
            switch(command[0]){
                case"Add":
                    String cardToAdd = command[1];
                    if(!cardsList.contains(cardToAdd)){
                        cardsList.add(cardToAdd);
                        System.out.println("Card successfully added");
                    }
                    else{
                        System.out.println("Card is already in the deck");
                    }
                    break;
                case"Remove":
                    String cardToRemove = command[1];
                    if(!cardsList.contains(cardToRemove)){
                        System.out.println("Card not found");
                    }
                    else {
                        cardsList.remove(cardToRemove);
                        System.out.println("Card successfully removed");
                    }
                    break;
                case"Remove At":
                    int indexToRemove = Integer.parseInt(command[1]);
                    if(indexToRemove>cardsList.size()-1||indexToRemove<0){
                        System.out.println("Index out of range");
                    }
                    else{
                        cardsList.remove(indexToRemove);
                        System.out.println("Card successfully removed");
                    }
                    break;
                case"Insert":
                    int indexToInsert = Integer.parseInt(command[1]);
                    String cardToInsert = command[2];
                    if(indexToInsert>cardsList.size()-1||indexToInsert<0){
                        System.out.println("Index out of range");
                    }
                    else if(cardsList.contains(cardToInsert)){
                        System.out.println("Card is already added");
                    }
                    else{
                        cardsList.add(indexToInsert,cardToInsert);
                        System.out.println("Card successfully added");
                    }
                    break;
            }
        }
        for(int i=0; i< cardsList.size();i++){
            if(i==cardsList.size()-1){
                System.out.print(cardsList.get(i));
            }
            else{
                System.out.print(cardsList.get(i)+", ");
            }
        }
    }
}
