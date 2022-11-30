package FinalExamPrep3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> coolList = new ArrayList<>();
        int emojiCount = 0;
        long threshold = 1;
        String text = sc.nextLine();

        Pattern patternDigits = Pattern.compile("[0-9]");
        Matcher matcherDigits = patternDigits.matcher(text);
        while (matcherDigits.find()){
            threshold *= Long.parseLong(matcherDigits.group());
        }

        Pattern pattern = Pattern.compile("([:*])\\1(?<emoji>[A-Z][a-z]{2,})\\1\\1");
        Matcher matcherEmoji = pattern.matcher(text);
        while (matcherEmoji.find()){
            emojiCount++;
            String emoji = matcherEmoji.group("emoji");
            int coolness = 0;
            for(int i=0; i<emoji.length(); i++){
                coolness = coolness + (int)emoji.charAt(i);
            }
            if(coolness>=threshold){
                coolList.add(matcherEmoji.group());
            }
        }
        System.out.println("Cool threshold: "+threshold);
        System.out.println(emojiCount+" emojis found in the text. The cool ones are:");
        for(String emoji:coolList){
            System.out.println(emoji);
        }
    }
}
