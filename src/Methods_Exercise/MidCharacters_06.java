package Methods_Exercise;

import java.util.Scanner;

public class MidCharacters_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        getMidChar(s);

    }
    public static void getMidChar(String s){
        if(s.length()%2!=0){
            System.out.println(s.charAt(s.length()/2));
        }
        else{
            System.out.print(s.charAt((s.length()-1)/2)+""+s.charAt((s.length())/2));
        }
    }

}
