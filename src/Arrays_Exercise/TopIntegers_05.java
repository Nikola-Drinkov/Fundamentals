package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isTop = false;
        for (int i = 0; i <arr.length ; i++) {
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    isTop=true;
                }
                else{
                    isTop=false;
                    break;
                }
            }

            if(isTop) {
                System.out.print(arr[i] + " ");
            }
            else if(i==arr.length-1){
                System.out.println(arr[i]);
            }
        }
    }
}
