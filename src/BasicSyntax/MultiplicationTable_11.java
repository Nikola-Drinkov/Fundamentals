package BasicSyntax;

import java.util.Scanner;

public class MultiplicationTable_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int multiplier = Integer.parseInt(sc.nextLine());
        int result;
        if(multiplier<=10) {
            for (int i = multiplier; i <= 10; i++) {
                result = n * i;
                System.out.printf("%d X %d = %d%n", n, i, result);
            }
        }
        else{
            result = n*multiplier;
            System.out.printf("%d X %d = %d%n", n, multiplier, result);
        }
    }
}
