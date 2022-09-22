package DataTypes_Exercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double largestVolume = 0;
        String biggestKeg = "";
        for(int i=1; i<=n; i++){
            String model = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());
            double volume = Math.PI*Math.pow(radius,2.0)*height;
            if(volume>largestVolume){
                biggestKeg = model;
                largestVolume=volume;
            }
        }
        System.out.println(biggestKeg);
    }
}
