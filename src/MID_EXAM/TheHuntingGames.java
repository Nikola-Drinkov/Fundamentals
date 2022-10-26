package MID_EXAM;

import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countDays = Integer.parseInt(sc.nextLine());
        int countPlayers = Integer.parseInt(sc.nextLine());
        double groupEnergy = Double.parseDouble(sc.nextLine());
        double waterFor1 = Double.parseDouble(sc.nextLine());
        double foodFor1 = Double.parseDouble(sc.nextLine());

        double totalWater = countDays*countPlayers*waterFor1;
        double totalFood = countDays*countPlayers*foodFor1;
        boolean outOfEnergy = false;

        for(int i=1; i<=countDays; i++){
            double energyLoss = Double.parseDouble(sc.nextLine());
            groupEnergy-=energyLoss;
            if(groupEnergy<=0){
                outOfEnergy=true;
                break;
            }
            if(i%2==0){
                groupEnergy+=groupEnergy*0.05;
                totalWater-=totalWater*0.30;
            }
            if(i%3==0){
                totalFood -= totalFood/countPlayers;
                groupEnergy+=groupEnergy*0.10;
            }
        }
        if(outOfEnergy){
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.",totalFood,totalWater);
        }
        else{
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!",groupEnergy);
        }
    }
}
