package BasicSyntax;

import java.util.Scanner;

public class SumOfOddNums_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int num=1;
        int sum=0;
        int add=2;
        for(int i=1; i<=n; i++){
            System.out.println(num);
            sum+=num;
            num+=add;

        }
        System.out.printf("Sum: %d",sum);
    }
}
