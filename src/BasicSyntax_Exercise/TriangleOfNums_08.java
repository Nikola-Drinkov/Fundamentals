package BasicSyntax_Exercise;

import java.util.Scanner;

public class TriangleOfNums_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
    }
}
