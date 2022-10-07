package Methods_Exercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=n ; i++) {
            if(sumIsDivisibleBy8(i) && holdsAtLeastOneOdd(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean sumIsDivisibleBy8(int n){
        int sum = 0;
        while (n>0){
            int currentDigit = n%10;
            sum+=currentDigit;
            n = n/10;
        }
        return sum%8==0;
    }
    public static boolean holdsAtLeastOneOdd(int n){
        while (n>0){
            int currentDigit = n%10;
            if(currentDigit%2!=0){
                return true;
            }
            n = n/10;
        }
        return false;
    }
}
