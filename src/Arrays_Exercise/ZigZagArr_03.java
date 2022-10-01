package Arrays_Exercise;

import java.util.Scanner;

public class ZigZagArr_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];
        for(int rows=1; rows<=n; rows++){
           String[] numbers = sc.nextLine().split(" ");
           String firstNumber = numbers[0];
           String secondNumber = numbers[1];

           if(rows%2==0){
               firstArray[rows-1]=secondNumber;
               secondArray[rows-1]=firstNumber;
           }
           else{
               firstArray[rows-1]=firstNumber;
               secondArray[rows-1]=secondNumber;
           }
        }
        for (String item:firstArray) {
            System.out.print(item+" ");
        }
        System.out.println();
        for (String item:secondArray) {
            System.out.print(item+" ");
        }
    }
}
