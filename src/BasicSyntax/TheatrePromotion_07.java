package BasicSyntax;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayType = sc.nextLine().toLowerCase();
        int age = Integer.parseInt(sc.nextLine());
        double price=0;

            switch (dayType) {
                case "weekday":
                    if (age>=0 && age <= 18) {
                        price = 12;
                    } else if (age>18 && age <= 64) {
                        price = 18;
                    } else if (age>64 &&age <= 122) {
                        price = 12;
                    }
                    break;
                case "weekend":
                    if (age>=0 && age <= 18) {
                        price = 15;
                    } else if (age>18 && age <= 64) {
                        price = 20;
                    } else if (age>64 &&age <= 122) {
                        price = 15;
                    }
                    break;
                case "holiday":
                    if (age>=0 && age <= 18) {
                        price = 5;
                    } else if (age>18 && age <= 64) {
                        price = 12;
                    } else if (age>64 &&age <= 122) {
                        price = 10;
                    }
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        if(age>=0) {
            System.out.printf("%.0f$", price);
        }
        else{
            System.out.println("Error!");
        }
    }
}
