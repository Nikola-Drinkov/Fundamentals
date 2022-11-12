package TextProcessing_Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNum_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger first = new BigInteger(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        System.out.println(first.multiply(BigInteger.valueOf(second)));
    }
}
