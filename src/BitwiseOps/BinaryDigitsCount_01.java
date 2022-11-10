package BitwiseOps;

import java.util.Scanner;

public class BinaryDigitsCount_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int digit = Integer.parseInt(sc.nextLine());
        int count0 = 0;
        int count1 = 0;
        while(num>0){
            if(num%2==1){
                 count1++;
            }
            else {
                count0++;
            }
           num=num/2;
        }
        if(digit==1){
            System.out.println(count1);
        }
        else{
            System.out.println(count0);
        }
    }
}
