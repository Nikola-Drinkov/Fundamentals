package Arrays_Exercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum=0;
        int [] train = new int[n];
        for(int i=0; i<n; i++){
            train[i]=Integer.parseInt(sc.nextLine());
            sum+=train[i];
        }
        for (int i : train) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
