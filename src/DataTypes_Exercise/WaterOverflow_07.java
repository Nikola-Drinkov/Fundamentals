package DataTypes_Exercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int total=0;
        for(int i=1; i<=n; i++){
            int currentL = Integer.parseInt(sc.nextLine());
            total+=currentL;
            if(total>255){
                System.out.println("Insufficient capacity!");
                total-=currentL;
            }
        }
        System.out.println(total);
    }
}
