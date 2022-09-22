package DataTypes_Exercise;


import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yield = Integer.parseInt(sc.nextLine());
        int totalSpice = 0;
        int days = 0;

        while(yield >=100){
            totalSpice+=yield;
            totalSpice-=26;
            days++;
            yield=yield-10;

        }
        if(totalSpice>26) {
            totalSpice -= 26;
        }
        else{
            totalSpice=0;
        }
        System.out.println(days);
        System.out.println(totalSpice);
    }
}
