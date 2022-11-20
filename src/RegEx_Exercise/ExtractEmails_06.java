package RegEx_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("(?<user>[A-Za-z0-9]+[.\\-_]?[A-Za-z0-9]+)@(?<host>(?<word1>[A-Za-z]+\\-?[A-Za-z]+)(?<word2>\\.?[A-Za-z]+\\-?[A-Za-z]+)+)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
