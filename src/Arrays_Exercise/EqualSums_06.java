package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isFound =false;

        for (int i = 0; i <arr.length; i++) {
            int leftSum=0;
            int rightSum=0;

            //leftSum
            for(int j=0; j<i; j++){
                leftSum+=arr[j];
            }
            //rightSum
            for (int k=i+1; k<arr.length; k++){
                rightSum+=arr[k];
            }
            if(leftSum==rightSum){
             isFound=true;
                System.out.println(i);
            }
        }
        if(!isFound){
            System.out.println("no");
        }
    }
}
