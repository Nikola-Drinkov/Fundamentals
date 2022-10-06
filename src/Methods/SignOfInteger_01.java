package Methods;

import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        checkSign(a);

    }
    public static void checkSign(int a){
        if(a<0){
            System.out.printf("The number %d is negative.",a);
        }
        else if(a>0){
            System.out.printf("The number %d is positive.",a);
        }
        else{
            System.out.printf("The number %d is zero.",a);
        }
    }
}
