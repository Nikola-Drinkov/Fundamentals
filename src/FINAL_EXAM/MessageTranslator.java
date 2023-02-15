package FINAL_EXAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i=0; i<n; i++){
            String text = sc.nextLine();
            Pattern pattern = Pattern.compile("\\!(?<com>[A-Z][a-z]{2,})\\!:(?<string>\\[[A-Za-z]{8,}\\])");
            Matcher matcher = pattern.matcher(text);
            if(matcher.find()){
                String command = matcher.group("com");
                System.out.print(command+": ");
                String str = matcher.group("string");
                Pattern patternAscii = Pattern.compile("[A-Za-z]");
                Matcher matcherAscii = patternAscii.matcher(str);
                List<String> asciiList = new ArrayList<>();
                while (matcherAscii.find()){
                    char[] matcherGroup = matcherAscii.group().toCharArray();
                    int asciiInt = matcherGroup[0];
                    String asciiStr = asciiInt+"";
                    asciiList.add(asciiStr);
                }
                System.out.println(String.join(" ",asciiList));
            }
            else{
                System.out.println("The message is invalid");
            }
        }
    }
}
