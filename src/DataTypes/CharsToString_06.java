package DataTypes;

import java.util.Scanner;

public class CharsToString_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.nextLine().charAt(0);
        char b = sc.nextLine().charAt(0);
        char c = sc.nextLine().charAt(0);
        System.out.printf("%c%c%c",a,b,c);
    }
}
