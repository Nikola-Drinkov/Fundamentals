package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequence_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxLength = 0;
        int length = 1;
        int startIndex = 0;
        int bestStartIndex = 0;

        for (int i = 1; i<arr.length; i++) {
            if(arr[i]==arr[i-1]){
                length++;
            }
            else{
                length=1;
                startIndex=i;
            }
            if(length>maxLength){
                maxLength=length;
                bestStartIndex=startIndex;
            }
        }
        for (int i = bestStartIndex; i<bestStartIndex+maxLength; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
