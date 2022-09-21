package DataTypes;

import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gbp = Double.parseDouble(sc.nextLine());
        System.out.printf("%.3f",gbp*1.36);
    }
}
