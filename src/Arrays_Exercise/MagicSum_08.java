package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <arr.length; i++) {
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==n){
                    System.out.print(arr[i]+" "+arr[j]);
                    System.out.println();
                }
            }
        }
    }
}
