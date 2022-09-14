package BasicSyntax;

import java.util.Scanner;

public class ForeignLanguages_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String country = sc.nextLine();
        String language;
        if(country.equals("England")||country.equals("USA")){
            language="English";
        }
        else if(country.equals("Spain")||country.equals("Argentina")||country.equals("Mexico")){
            language="Spanish";
        }
        else{
            language = "unknown";
        }
        System.out.println(language);
    }
}
