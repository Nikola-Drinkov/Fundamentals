package ClassesObjects;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        BigInteger result = BigInteger.valueOf(1);
        for(int i=1; i<=n;i++){
            result=result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
