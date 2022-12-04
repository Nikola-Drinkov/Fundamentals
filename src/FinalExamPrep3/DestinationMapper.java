package FinalExamPrep3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(text);
        int travelPoints = 0;
        List<String> destList = new ArrayList<>();
        while (matcher.find()){
            String destination = matcher.group("destination");
            int points = destination.length();
            travelPoints+=points;
            destList.add(destination);
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ",destList));
        System.out.println("Travel Points: "+travelPoints);
    }
}
