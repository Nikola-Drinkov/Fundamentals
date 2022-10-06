package Methods;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        printTriangle(n);
    }
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printBigTriangle(1,i);
        }
        for (int i = n-1; i>=1; i--) {
            printLilTriangle(1,i);
        }
    }
        public static void printBigTriangle(int start, int end){
            for (int i = start; i <=end ;i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        public static void printLilTriangle(int start, int end){
            for (int i = start; i <=end ; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
