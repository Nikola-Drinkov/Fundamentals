package Methods_Exercise;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for (int row = 1; row <=n; row++) {
            for(int col=1; col<=n; col++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
