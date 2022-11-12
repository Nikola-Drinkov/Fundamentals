package TextProcessing_Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        StringBuilder replaced = new StringBuilder();
        for(int i =0; i<text.length(); i++) {
            if (i < text.length() - 1) {
                if (text.charAt(i) != text.charAt(i + 1))
                    replaced.append(text.charAt(i));
            }
            else replaced.append(text.charAt(i));
        }
        System.out.println(replaced);
    }
}
