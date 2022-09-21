package DataTypes;

import java.util.Scanner;

public class RefactorSpecialNum_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            boolean isSpecialNum = false;
            int sum = 0;
            int currentNum = i;
            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }
             if((sum == 5) || (sum == 7) || (sum == 11)){
                 isSpecialNum=true;
             }

            System.out.printf("%d -> %b%n", i, isSpecialNum);
        }

    }
}
