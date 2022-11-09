package TextProcessing;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] words = sc.nextLine().split(" ");
        StringBuilder result = new StringBuilder();
        for(String word:words){
            result.append(repeatWord(word));
        }
        System.out.println(result.toString());
    }
    public static String repeatWord(String word){
        StringBuilder repeatWord = new StringBuilder();
        for(int i=0; i<word.length(); i++){
            repeatWord.append(word);
        }
        return repeatWord.toString();
    }
}
