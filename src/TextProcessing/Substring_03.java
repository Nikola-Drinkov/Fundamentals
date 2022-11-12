package TextProcessing;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        while(second.contains(first)){
            second = second.replace(first,"");
        }
        System.out.println(second);
    }
}
