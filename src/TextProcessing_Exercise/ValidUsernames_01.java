package TextProcessing_Exercise;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] usernames = sc.nextLine().split(", ");
        for(String name:usernames){
            if(isValid(name))
                System.out.println(name);
        }
    }
    private static boolean isValid(String username){
        if(username.length()<3||username.length()>16)
            return false;
        for(char c:username.toCharArray()){
            if(!Character.isLetterOrDigit(c)&&c!='-'&&c!='_')
                return false;
        }
        return true;
    }
}
