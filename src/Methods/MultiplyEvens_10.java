package Methods;

import java.util.Scanner;

public class MultiplyEvens_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(Integer.parseInt(sc.nextLine()));
        System.out.println(getMultipleOfEvensAndOdds(n));
    }
        public static int getMultipleOfEvensAndOdds(int n){
           int sumEvens = getSumOfEvens(n);
           int sumOdds = getSumOfOdds(n);
        return sumEvens*sumOdds;
        }
        public static int getSumOfEvens(int n){
        int currentDigit=0;
        int sumEven=0;
        while(n>0){
            currentDigit = n%10;
            if(currentDigit%2==0){
                sumEven+=currentDigit;
            }
            n=n/10;
        }
        return sumEven;
        }

    public static int getSumOfOdds(int n){
        int currentDigit=0;
        int sumOdds=0;
        while(n>0){
            currentDigit = n%10;
            if(currentDigit%2!=0){
                sumOdds+=currentDigit;
            }
            n=n/10;
        }
        return sumOdds;
    }
}
