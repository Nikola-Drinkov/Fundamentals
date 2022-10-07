package Methods_Exercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        long factFirst = factorial(first);
        long factSecond = factorial(second);
        double result = factFirst*1.0/factSecond;
        System.out.printf("%.2f",result);
    }
    public static long factorial(int n){
        long fact = 1;
        for (int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
}
