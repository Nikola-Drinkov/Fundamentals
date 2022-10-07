package Methods_Exercise;

import java.util.Scanner;

public class PalindromeInt_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("END")){
            int n = Integer.parseInt(input);
            if(checkPalindrome(n)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
            input = sc.nextLine();
        }

    }
    public static boolean checkPalindrome(int num){
        int reversedNum = 0, remainder;
        int originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num/10;
        }
       return originalNum==reversedNum;
    }
}
