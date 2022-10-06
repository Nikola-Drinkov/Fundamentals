package Methods;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = Integer.parseInt(sc.nextLine());
        char operator = sc.nextLine().charAt(0);
        int secondNum = Integer.parseInt(sc.nextLine());
        System.out.printf("%.0f",calculate(firstNum,operator,secondNum));

    }
    public static double calculate(double first, char operator, double second){
        double result = 0;
        switch (operator){
            case'/':
                result= first/second;
            break;
            case'*':
                result= first*second;
                break;
            case'+':
            result= first+second;
                break;
            case'-':
            result= first-second;
                break;
        }
        return result;
    }
}
