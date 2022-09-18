package BasicSyntax_Exercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        double availableSum = 0;

        while(!input.equals("Start")){
            double currentCoin = Double.parseDouble(input);
            if(currentCoin==0.1||currentCoin==0.2||currentCoin==0.5||currentCoin==1||currentCoin==2){
                availableSum+=currentCoin;
            }
            else{
                System.out.printf("Cannot accept %.2f",currentCoin);
                System.out.println();
            }
            input=sc.nextLine();
        }

        String secondInput = sc.nextLine();
        double priceNuts = 2;
        double priceWater = 0.7;
        double priceCrisps = 1.5;
        double priceSoda = 0.8;
        double priceCoke = 1.0;
        double sumRequired = 0;

        while(!secondInput.equals("End")){
            boolean valid = true;
            switch (secondInput){
                case"Nuts":
                    sumRequired=priceNuts;
                    break;
                case"Water":
                    sumRequired=priceWater;
                    break;
                case"Crisps":
                    sumRequired=priceCrisps;
                    break;
                case"Soda":
                    sumRequired=priceSoda;
                    break;
                case"Coke":
                    sumRequired=priceCoke;
                    break;
                default:
                    System.out.println("Invalid product");
                    valid = false;
                    break;
            }
            if(valid) {
                if (availableSum >= sumRequired) {
                    System.out.printf("Purchased %s%n", secondInput);
                    availableSum -= sumRequired;
                } else {
                    System.out.printf("Sorry, not enough money%n");
                }
            }
            secondInput=sc.nextLine();
        }
        System.out.printf("Change: %.2f%n",availableSum);
    }
}
