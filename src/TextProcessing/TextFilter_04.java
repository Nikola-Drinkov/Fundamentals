package TextProcessing;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] bannedWords = sc.nextLine().split(", ");
        String text = sc.nextLine();
        for (String word:bannedWords){
            while(text.contains(word)){
                text = text.replaceAll(word,returnStars(word));
            }
        }
        System.out.println(text);
    }
    public static String returnStars(String word){
        StringBuilder stars = new StringBuilder();
        for(int i=0; i<word.length();i++){
            stars.append("*");
        }
        return stars.toString();
    }
}
