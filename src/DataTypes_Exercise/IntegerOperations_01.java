package DataTypes_Exercise;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());
        int fourth = Integer.parseInt(sc.nextLine());

        System.out.println((first+second)/third*fourth);
    }
}
