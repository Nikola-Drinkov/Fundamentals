package FinalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String barcode = sc.nextLine();
            Pattern pattern = Pattern.compile("@[#]+([A-Z][A-Za-z0-9]{4,}[A-Z])@[#]+");
            Matcher matcher = pattern.matcher(barcode);
            if(matcher.find()){
                StringBuilder productGroup = new StringBuilder();
                Pattern digitsPattern = Pattern.compile("[0-9]*");
                Matcher matcherDigits = digitsPattern.matcher(matcher.group());
                while (matcherDigits.find()){
                    productGroup.append(matcherDigits.group());
                }
                if (productGroup.length()==0)
                    productGroup = new StringBuilder("00");
                System.out.printf("Product group: %s%n",productGroup);
            }
            else System.out.println("Invalid barcode");
        }
    }
}
