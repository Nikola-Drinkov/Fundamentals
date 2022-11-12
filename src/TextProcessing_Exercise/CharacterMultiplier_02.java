package TextProcessing_Exercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] text = sc.nextLine().split(" ");
        String first = text[0];
        String second = text[1];
        if (first.length() > second.length())
            returnSum(first, second);
        else if (first.length() < second.length())
            returnSum(second,first);
        else{
            int sum = 0;
            for (int i = 0; i < first.length(); i++) {
                sum += ((int) first.charAt(i) * (int) second.charAt(i));
            }
            System.out.println(sum);
        }
    }
    public static void returnSum(String longer, String shorter){
        int sum =0;
        for (int i = 0; i < shorter.length(); i++) {
            sum += ((int) longer.charAt(i) * (int) shorter.charAt(i));
        }
        String remainder = longer.substring(shorter.length());
        for (int i = 0; i < remainder.length(); i++)
            sum += (int) remainder.charAt(i);
        System.out.println(sum);
    }
}
