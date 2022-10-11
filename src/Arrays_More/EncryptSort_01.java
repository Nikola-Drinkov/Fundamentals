package Arrays_More;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSort_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int [] stringValues = new int[n];
        for (int i = 0; i <n; i++) {
            String input = sc.nextLine();
            char[] inputChar = input.toCharArray();
            int sum = 0;
            for(int j=0; j< inputChar.length;j++){
                if(inputChar[j]=='a'||inputChar[j]=='e'||inputChar[j]=='i'||inputChar[j]=='o'||inputChar[j]=='u'){
                    sum+=(int)inputChar[j]* inputChar.length;
                }
                else{
                    sum+=(int)inputChar[j]/ inputChar.length;
                }
            }
            stringValues[i]=sum;
        }
        Arrays.sort(stringValues);
        for (int item:stringValues) {
            System.out.println(item);
        }
        System.out.println();
    }
}
