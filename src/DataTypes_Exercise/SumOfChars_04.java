package DataTypes_Exercise;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());
        int sum=0;
        for(int i=1; i<=lines; i++){
            char currentChar = sc.nextLine().charAt(0);
            sum+=currentChar;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
