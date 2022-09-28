package Arrays;

import java.util.Scanner;

public class PrintReverse_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            int currentNum = Integer.parseInt(sc.nextLine());
            arr[i]=currentNum;
        }
        for(int j=n-1; j>=0; j--){
            System.out.print(arr[j]+" ");
        }
    }
}
