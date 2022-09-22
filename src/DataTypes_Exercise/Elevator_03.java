package DataTypes_Exercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        int capacity = Integer.parseInt(sc.nextLine());
        double courses = (double) people/capacity;
        System.out.printf("%.0f",Math.ceil(courses));
    }
}
