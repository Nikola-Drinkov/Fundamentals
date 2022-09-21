package DataTypes;

import java.util.Scanner;

public class ConvertToKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = Integer.parseInt(sc.nextLine());
        double km = m/1000.0;
        System.out.printf("%.2f",km);
    }
}
