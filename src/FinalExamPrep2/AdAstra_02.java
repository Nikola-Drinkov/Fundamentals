package FinalExamPrep2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int totalCal = 0;
        StringBuilder output = new StringBuilder();
        Pattern pattern = Pattern.compile("([|#])(?<item>[A-Za-z\\s]+)\\1(?<exp>[\\d]{2}\\/[\\d]{2}\\/[\\d]{2})\\1(?<cal>[\\d]+)\\1");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            String item = matcher.group("item");
            String bb = matcher.group("exp");
            String cal = matcher.group("cal");
            totalCal += Integer.parseInt(matcher.group("cal"));
            output.append(String.format("Item: %s, Best before: %s, Nutrition: %s%n",item,bb,cal));
        }
        System.out.printf("You have food to last you for: %d days!%n",totalCal/2000);
        System.out.println(output);
    }
}
