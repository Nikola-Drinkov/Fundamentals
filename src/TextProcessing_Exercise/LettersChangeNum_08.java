package TextProcessing_Exercise;

import java.util.Scanner;

public class LettersChangeNum_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] strings = sc.nextLine().split("\\s+");
        double total = 0;
        for(String string:strings){
            double result = 0;
            char firstLet = string.charAt(0);
            int num = Integer.parseInt(string.substring(1,string.length()-1));
            char secondLet = string.charAt(string.length()-1);
            if(Character.isUpperCase(firstLet)){
                int position = (int)firstLet-64;
                result = num*1.0/position;
            }
            else{
                int position = (int)firstLet-96;
                result = num*1.0*position;
            }
            if(Character.isUpperCase(secondLet)){
                int position = (int)secondLet-64;
                result -= position;
            }
            else {
                int position = (int)secondLet-96;
                result += position;
            }
            total+=result;
        }
        System.out.printf("%.2f",total);
    }
}
