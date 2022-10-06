package Methods;

import java.util.Scanner;

public class RectangleArea_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        System.out.println(returnArea(a,b));
    }
    public static int returnArea(int a, int b){
        return a*b;
    }
}
