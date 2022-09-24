package DataTypes_Exercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;
        double bestValue = Double.MIN_VALUE;

       for(int i=1; i<=n; i++){
           int snowballSnow = Integer.parseInt(sc.nextLine());
           int snowballTime =Integer.parseInt(sc.nextLine());
           int snowballQuality = Integer.parseInt(sc.nextLine());
           double snowballValue = Math.pow((1.0*snowballSnow / snowballTime),snowballQuality);
           if(snowballValue>=bestValue){
               bestSnow = snowballSnow;
               bestTime = snowballTime;
               bestQuality = snowballQuality;
               bestValue = snowballValue;
           }
       }
        System.out.printf("%d : %d = %.0f (%d)",bestSnow,bestTime,bestValue,bestQuality);
    }
}
