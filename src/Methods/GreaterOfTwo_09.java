package Methods;

import java.util.Scanner;

public class GreaterOfTwo_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        switch (type){
            case "int":
                int firstNum = Integer.parseInt(sc.nextLine());
                int secondNum = Integer.parseInt(sc.nextLine());
                System.out.println(getMax(firstNum,secondNum));
                break;
            case"char":
                char firstChar = sc.nextLine().charAt(0);
                char secondChar = sc.nextLine().charAt(0);
                System.out.println(getMax(firstChar,secondChar));
                break;
            case"string":
                String firstName = sc.nextLine();
                String secondName = sc.nextLine();
                System.out.println(getMax(firstName,secondName));
                break;
        }
    }
    public static int getMax(int first, int second){
        if(first>second){
            return first;
        }
        else{
            return second;
        }
    }
    public static char getMax(char first, char second){
        if(first>second){
            return first;
        }
        else {
            return second;
        }
    }
    public static String getMax(String first, String second){
        if(first.compareTo(second)>=0){
            return first;
        }
        return second;
    }
}
