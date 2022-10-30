package ClassesObjects;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger firstNum = new BigInteger(sc.nextLine());
        BigInteger secondNum = new BigInteger(sc.nextLine());
        BigInteger result = firstNum.add(secondNum);
        System.out.println(result);

    }
}
