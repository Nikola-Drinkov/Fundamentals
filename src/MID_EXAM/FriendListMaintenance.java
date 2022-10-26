package MID_EXAM;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> friendList = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        String input = sc.nextLine();
        int countBlacklisted = 0;
        int countLost = 0;
        while(!input.equals("Report")){
            String [] command = input.split(" ");
            switch(command[0]){
                case"Blacklist":
                    String nameToBlacklist = command[1];
                    if(friendList.contains(nameToBlacklist)) {
                        int indexOfName = friendList.indexOf(nameToBlacklist);
                        friendList.set(indexOfName, "Blacklisted");
                        System.out.printf("%s was blacklisted.%n", nameToBlacklist);
                        countBlacklisted++;
                    }
                    else{
                        System.out.printf("%s was not found.%n",nameToBlacklist);
                    }
                    break;
                case"Error":
                    int index = Integer.parseInt(command[1]);
                    if(isValidIndex(friendList,index)){
                        String nameAtIndex = friendList.get(index);
                        if(!nameAtIndex.equals("Blacklisted")&&!nameAtIndex.equals("Lost")) {
                            friendList.set(index, "Lost");
                            System.out.printf("%s was lost due to an error.%n", nameAtIndex);
                            countLost++;
                        }
                    }
                    break;
                case"Change":
                    int indexForChange = Integer.parseInt(command[1]);
                    String newName = command[2];
                    if(isValidIndex(friendList,indexForChange)){
                        String oldName = friendList.get(indexForChange);
                        friendList.set(indexForChange,newName);
                        System.out.printf("%s changed his username to %s.%n",oldName,newName);
                    }
                        break;
            }
            input = sc.nextLine();
        }
        System.out.printf("Blacklisted names: %d%n",countBlacklisted);
        System.out.printf("Lost names: %d%n",countLost);
        for(String name:friendList){
            System.out.print(name+" ");
        }
    }
    public static boolean isValidIndex(List<String> friendList, int index){
        return index >= 0 && index < friendList.size();
    }
}
