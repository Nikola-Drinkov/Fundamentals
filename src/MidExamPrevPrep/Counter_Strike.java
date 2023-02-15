package MidExamPrevPrep;

import java.util.Scanner;

public class Counter_Strike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean notEnoughE = false;
        int won = 0;
        int energy  =Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        while (!input.equals("End of battle")){
            int distance = Integer.parseInt(input);
             if(energy>=distance) {
                energy -= distance;
                won++;
            }
            else{
                notEnoughE = true;
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n",won,energy);
                break;
            }
            if(won%3==0){
                energy+=won;
            }
            input = sc.nextLine();
        }
        if(!notEnoughE) {
            System.out.printf("Won battles: %d. Energy left: %d%n", won, energy);
        }
    }
}
