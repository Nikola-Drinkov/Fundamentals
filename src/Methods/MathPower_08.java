package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = Double.parseDouble(sc.nextLine());
        double pow = Double.parseDouble(sc.nextLine());
        DecimalFormat decimalFormat = new DecimalFormat("0.#########");
        System.out.println(decimalFormat.format(mathPower(n,pow)));

    }
    public static double mathPower(double n, double pow){
        double result = 1;
        for(int i=1; i<=pow; i++){
            result = result*n;
        }
        return result;
    }
}
