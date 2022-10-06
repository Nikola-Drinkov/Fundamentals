package Methods_Exercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char start = sc.nextLine().charAt(0);
        char end = sc.nextLine().charAt(0);
        returnCharBetween(start,end);
    }

    public static void returnCharBetween(char startChar, char endChar){
        if(startChar>endChar) {
            for (char i = (char) (((int) endChar) + 1); i < startChar; i++) {
                System.out.print(i + " ");
            }
        }
        else{
            for (char i = (char) (((int) startChar) + 1); i < endChar; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
