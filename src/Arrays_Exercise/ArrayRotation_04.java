package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(sc.nextLine());

        for (int rotation = 1; rotation <=rotations ; rotation++) {
            int firstNumber = numbers[0];
            for (int i = 0; i <numbers.length-1 ; i++) {
                numbers[i]=numbers[i+1];
            }
            numbers[numbers.length-1]=firstNumber;
        }
        for (int num:numbers) {
            System.out.print(num+" ");
        }
    }
}
