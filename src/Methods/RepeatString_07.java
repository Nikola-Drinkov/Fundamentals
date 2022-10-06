package Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        repeatString(input,n);

    }
    public static void repeatString(String input,int n){
        String result ="";
        for (int i = 0; i <n ; i++) {
            result+=input;
        }
        System.out.print(result);
    }
}
