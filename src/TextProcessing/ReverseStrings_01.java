package TextProcessing;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        while(!input.equals("end")){
            StringBuilder reversed = new StringBuilder();
            for(int i = input.length()-1; i>=0; i--){
                reversed.append(input.charAt(i));
            }
            System.out.printf("%s = %s%n", input,reversed);
            input = sc.nextLine();
        }
    }
}
