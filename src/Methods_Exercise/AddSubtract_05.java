package Methods_Exercise;

import java.util.Scanner;

public class AddSubtract_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());
        calculate(first,second,third);
    }
    public static void calculate(int first, int second, int third){
        System.out.println((first+second)-third);
    }
}
