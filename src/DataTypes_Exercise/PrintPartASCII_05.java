package DataTypes_Exercise;

import java.util.Scanner;

public class PrintPartASCII_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int from = Integer.parseInt(sc.nextLine());
        int to = Integer.parseInt(sc.nextLine());

        for(int i=from; i<=to;i++){
            System.out.printf("%c ",i);
        }
    }
}
