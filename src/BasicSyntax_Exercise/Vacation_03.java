package BasicSyntax_Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double count = Double.parseDouble(sc.nextLine());
        String people = sc.nextLine();
        String day = sc.nextLine();
        double price=0;
        double totalSum=0;

        switch (people){
            case"Students":
                switch (day) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                totalSum=price*count;
                if(count>=30) {
                    totalSum -= (totalSum*0.15);
                }
                break;
            case"Business":
                switch (day) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                totalSum=price*count;
                if(count>=100){
                    totalSum-=(price*10);
                }
                break;
            case"Regular":
                switch (day) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }
                totalSum=price*count;
                if(count>=10&&count<=20){
                    totalSum = totalSum*0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f",totalSum);
    }
}
