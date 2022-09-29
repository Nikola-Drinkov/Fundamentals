package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] inputLine = sc.nextLine().split(" ");
        int [] arr = Arrays.stream(inputLine).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;

        for (int item:arr) {
            if(item%2==0){
                evenSum+=item;
            }
        }
        System.out.println(evenSum);
    }
}
