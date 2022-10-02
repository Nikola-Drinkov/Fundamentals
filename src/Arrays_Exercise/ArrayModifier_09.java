package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = sc.nextLine();
        while(!input.equals("end")){
            if(input.contains("swap")){
                String [] swapCommand = input.split(" ");
                int firstIndex = Integer.parseInt(swapCommand[1]);
                int secondIndex = Integer.parseInt(swapCommand[2]);

                int temp = arr[firstIndex];
                arr[firstIndex]=arr[secondIndex];
                arr[secondIndex]=temp;

            }
            else if(input.contains("multiply")){
                String [] multiplyCommand = input.split(" ");
                int firstIndex = Integer.parseInt(multiplyCommand[1]);
                int secondIndex = Integer.parseInt(multiplyCommand[2]);

                arr[firstIndex] = arr[firstIndex]*arr[secondIndex];
            }
            else if(input.contains("decrease")){
                for (int i = 0; i <arr.length ; i++) {
                    arr[i]-=1;
                }
            }
            input = sc.nextLine();
        }
        for (int i = 0; i <arr.length ; i++) {
            if(i!=arr.length-1){
                System.out.print(arr[i]+", ");
            }
            else{
                System.out.print(arr[i]);
            }
        }
    }
}
