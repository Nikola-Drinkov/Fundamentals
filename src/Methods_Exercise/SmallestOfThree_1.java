package Methods_Exercise;

import java.util.Scanner;

public class SmallestOfThree_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());
        int thirdNum = Integer.parseInt(sc.nextLine());
        System.out.println(smallestNum(firstNum,secondNum,thirdNum));
    }
    public static int smallestNum(int first, int second, int third){
        int min;
        if(first<second&&first<third){
            min = first;
        }
        else if(second<first&&second<third){
            min = second;
        }
        else{
            min = third;
        }
        return min;
    }
}
