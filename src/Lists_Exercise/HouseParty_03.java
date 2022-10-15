package Lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countCommands = Integer.parseInt(sc.nextLine());
        List<String> guestsList = new ArrayList<>();
        for (int i = 1; i <=countCommands ; i++) {
            String input = sc.nextLine();
            String [] command = input.split(" ");
            String guest = command[0];
            if(command.length==3){
                if(!guestsList.contains(guest)){
                    guestsList.add(guest);
                }
                else{
                    System.out.printf("%s is already in the list!%n",guest);
                }
            }
            else if(command.length==4){
                if(guestsList.contains(guest)){
                    guestsList.remove(guest);
                }
                else{
                    System.out.printf("%s is not in the list!%n",guest);
                }
            }
        }
        for(String guest:guestsList){
            System.out.println(guest);
        }
    }
}
