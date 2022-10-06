package Arrays_Exercise;

import java.util.Scanner;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] treasureChest = (sc.nextLine().split("\\|"));
        String input = sc.nextLine();
        while (!input.equals("Yohoho!")){

            if(input.contains("Loot")){
                String [] command = input.split(" ");
                for(int i=1; i<command.length; i++){
                    boolean alreadyContained = false;
                    for(int j=0; j<treasureChest.length; j++){
                        if(command[i].equals(treasureChest[j])){
                            alreadyContained = true;
                            break;
                        }
                    }
                    if(!alreadyContained){
                        String newChest = command[i]+" "+String.join(" ",treasureChest);
                        treasureChest = newChest.split(" ");
                    }
                }
            }

            else if(input.contains("Drop")){
                String[] command = input.split(" ");
                int index = Integer.parseInt(command[1]);
                if(index>=0&&index<treasureChest.length){
                    String dropItem = treasureChest[index];
                    for (int i=index; i<treasureChest.length; i++){
                        treasureChest[i] = treasureChest[i+1];
                    }
                    treasureChest[treasureChest.length-1]=dropItem;
                }
                else{
                    break;
                }
            }

            else if(input.contains("Steal")){
                String[] command = input.split(" ");
                int lastStolen = Integer.parseInt(command[1]);
                if(lastStolen>=0&&lastStolen<treasureChest.length){
                    for(int i=0; i<lastStolen; i++){
                        System.out.println(treasureChest[treasureChest.length-lastStolen+i]);
                        if(i!=lastStolen-1){
                            System.out.println(", ");
                        }
                    }
                    String[] tempChest = new String[treasureChest.length-lastStolen];
                    for(int i=0; i<tempChest.length;i++){
                        tempChest[i]=treasureChest[i];
                    }
                    treasureChest = tempChest;
                }
                else if(lastStolen>=0){
                    for(int i=0; i<treasureChest.length; i++){
                        System.out.println(treasureChest[i]);
                        if(i!= treasureChest.length-1){
                            System.out.println(", ");
                        }
                    }
                    treasureChest = new String[0];
                }
                System.out.println();
                break;
            }

            input = sc.nextLine();
        }
        String treasureCount = String.join("",treasureChest);
        int charCounter = 0;
        for(int i=0; i<treasureCount.length();i++){
            charCounter++;
        }
        double averageTreasure = (1.0* charCounter)/treasureChest.length;
        if(charCounter>0){
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        }
        else{
            System.out.println("Failed treasure hunt.");
        }
    }
}
