package DataTypes_Exercise;

import java.util.Scanner;

public class Pokemon_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pokePower = Integer.parseInt(sc.nextLine());
        int originalPower = pokePower;
        int distanceBetween = Integer.parseInt(sc.nextLine());
        int exhaustionFactor = Integer.parseInt(sc.nextLine());
        int countTargets = 0;

        while (pokePower>=distanceBetween){
            pokePower-=distanceBetween;
            countTargets++;
            if(pokePower==originalPower/2){
                if(exhaustionFactor!=0) {
                    pokePower = pokePower / exhaustionFactor;
                }
            }

        }

        System.out.println(pokePower);
        System.out.println(countTargets);
    }
}
