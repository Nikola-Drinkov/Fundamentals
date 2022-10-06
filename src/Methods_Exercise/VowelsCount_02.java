package Methods_Exercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().toLowerCase();
        System.out.println(countVowels(word));
    }
    public static int countVowels(String word){
        int countVowels=0;
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i)=='a'||
                    word.charAt(i)=='e'||
                    word.charAt(i)=='i'||
                    word.charAt(i)=='o'||
                    word.charAt(i)=='u'){
                countVowels++;
            }
        }
        return countVowels;
    }
}
