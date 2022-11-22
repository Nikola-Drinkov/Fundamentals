package RegEx_Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> planetsA = new ArrayList<>();
        List<String> planetsD = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String encryptedMsg = sc.nextLine();
            String decryptedMsg = decrypt(encryptedMsg);
            Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)[^@\\-!:>]*:(?<pop>\\d+)[^@\\-!:>]*!(?<type>[AD])![^@\\-!:>]*->(?<sold>\\d+)");
            Matcher matcher = pattern.matcher(decryptedMsg);
            if(matcher.find()){
                String name = matcher.group("name");
                String type = matcher.group("type");
                if(type.equals("A")){
                    planetsA.add(name);
                }
                else if(type.equals("D")){
                    planetsD.add(name);
                }
            }
        }

        Collections.sort(planetsA);
        Collections.sort(planetsD);

        System.out.printf("Attacked planets: %d%n",planetsA.size());
        for(String planet:planetsA){
            System.out.printf("-> %s%n",planet);
        }
        System.out.printf("Destroyed planets: %d%n",planetsD.size());
        for(String planet:planetsD){
            System.out.printf("-> %s%n",planet);
        }
    }
    public static String decrypt(String encryptedMsg){
        int countSpecial = getCountSpecial(encryptedMsg);
        StringBuilder decryptedMsg = new StringBuilder();

        for(char letter:encryptedMsg.toCharArray()){
            letter = (char)((int)letter-countSpecial);
            decryptedMsg.append(letter);
        }
        return decryptedMsg.toString();
    }

    private static int getCountSpecial(String encryptedMsg) {
        int countSpecial=0;
        for(int i=0; i<encryptedMsg.length();i++){
            switch (encryptedMsg.charAt(i)){
                case's':
                case't':
                case'a':
                case'r':
                case'S':
                case'T':
                case'A':
                case'R':
                    countSpecial++;
            }
        }
        return countSpecial;
    }
}
