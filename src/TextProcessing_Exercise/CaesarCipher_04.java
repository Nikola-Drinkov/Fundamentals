package TextProcessing_Exercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        StringBuilder encrypt = new StringBuilder();
        for(char currentChar:text.toCharArray()){
            encrypt.append((char)(currentChar+3));
        }
        System.out.println(encrypt);
    }
}
