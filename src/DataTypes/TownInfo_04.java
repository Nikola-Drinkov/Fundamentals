package DataTypes;

import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();
        int population = Integer.parseInt(sc.nextLine());
        short area = Short.parseShort(sc.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",city,population,area);
    }
}
