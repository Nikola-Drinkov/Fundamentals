package TextProcessing;

import java.util.Scanner;

public class DigitalLetters_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        StringBuilder numbers = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for(int i=0; i<text.length();i++){
            Character currentChar = text.charAt(i);
            if(Character.isLetter(currentChar))
                letters.append(currentChar);
            else if(Character.isDigit(currentChar))
                numbers.append(currentChar);
            else others.append(currentChar);
        }
        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(others);
    }
}
