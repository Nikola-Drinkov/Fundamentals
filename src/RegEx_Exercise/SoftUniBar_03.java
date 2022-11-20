package RegEx_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBar_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double total = 0;
        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|.$%]*<(?<product>\\w+)>[^|.$%]*\\|(?<count>\\d+)\\|[^|.$%]*?(?<price>\\d+\\.?\\d*)\\$");
        while (!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
             String name = matcher.group("name");
             String product = matcher.group("product");
             int count = Integer.parseInt(matcher.group("count"));
             double price = Double.parseDouble(matcher.group("price"));
                System.out.printf("%s: %s - %.2f%n",name,product,count*price);
                total+=count*price;
            }
            input = sc.nextLine();
        }
        System.out.printf("Total income: %.2f",total);
    }
}
