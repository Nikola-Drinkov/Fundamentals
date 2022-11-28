package FinalExamPrep3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> mirrorWords = new ArrayList<>();
        int countValid = 0;
        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("([@#])(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            countValid++;
            String firstWord = matcher.group("first");
            String secondWord = matcher.group("second");
            StringBuilder second = new StringBuilder(secondWord);
            if(firstWord.equals(second.reverse().toString())){
                mirrorWords.add(matcher.group());
            }
        }
        if(countValid==0){
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }
        else {
            System.out.println(countValid + " word pairs found!");
            if(mirrorWords.size()>0) {
            System.out.println("The mirror words are:");
                for (int i = 0; i < mirrorWords.size(); i++) {
                    String first = mirrorWords.get(i).split("[#@]{2}")[0];
                    first = first.replaceAll("[#@]", "");
                    String second = mirrorWords.get(i).split("[#@]{2}")[1];
                    second = second.replaceAll("[#@]", "");
                    if (i == mirrorWords.size() - 1) {
                        System.out.print(first + " <=> " + second);
                    } else System.out.print(first + " <=> " + second + ", ");
                }
            }
            else System.out.println("No mirror words!");
        }
    }
}
