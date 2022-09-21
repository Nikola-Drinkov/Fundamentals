package DataTypes;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.nextLine().charAt(0);
        if(a>=65&&a<=90){
            System.out.println("upper-case");
        }
        else if(a>=97&&a<=122){
            System.out.println("lower-case");
        }
    }
}
