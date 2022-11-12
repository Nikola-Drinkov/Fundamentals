package TextProcessing_Exercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder(sc.nextLine());
        int totalStrength = 0;
        for(int i=0; i<builder.length(); i++){
            if(builder.charAt(i)=='>'){
                int strength = Integer.parseInt(String.valueOf(builder.charAt(i+1)));
                totalStrength+=strength;
            }
            if(builder.charAt(i)!='>'&&totalStrength>0){
                builder.deleteCharAt(i);
                totalStrength--;
                i--;
            }
        }
        System.out.println(builder);
    }
}
