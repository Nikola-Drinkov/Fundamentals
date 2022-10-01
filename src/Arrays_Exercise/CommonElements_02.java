package Arrays_Exercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String[] firstArr = sc.nextLine().split(" ");
       String[] secondArr = sc.nextLine().split(" ");
        for (String s : secondArr) {
            for (String value : firstArr) {
                if (s.equals(value)) {
                    System.out.print(s + " ");
                }
            }
        }
    }
}
