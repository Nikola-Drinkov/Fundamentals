package RegEx_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> furniture = new ArrayList<>();
        double sum = 0;
        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        while(!input.equals("Purchase")){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            while(matcher.find()){
                furniture.add(matcher.group("name"));
                sum+=Double.parseDouble(matcher.group("price"))*Integer.parseInt(matcher.group("quantity"));
            }
            input=sc.nextLine();
        }
        System.out.println("Bought furniture:");
        for(String piece:furniture){
            System.out.println(piece);
        }
        System.out.printf("Total money spend: %.2f",sum);
    }
}
