package Methods_Exercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        if(checkLength(password)&&checkCharacters(password)&&checkFor2Digits(password)){
            System.out.println("Password is valid");
        }
        if(!checkLength(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!checkCharacters(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if(!checkFor2Digits(password)){
            System.out.println("Password must have at least 2 digits");
        }

    }
    public static boolean checkLength(String password){
        return (password.length()>=6&&password.length()<=10);
    }
    public static boolean checkCharacters(String password){
        int countValidDigits=0;
        for (int i = 0; i <password.length() ; i++) {
            if(password.charAt(i)>='0'&&password.charAt(i)<='9'||
                    password.charAt(i)>='a'&&password.charAt(i)<='z'||
                    password.charAt(i)>='A'&&password.charAt(i)<='Z'){
                countValidDigits++;
            }
        }
        return countValidDigits==password.length();
    }
    public static boolean checkFor2Digits(String password){
        int countDigits=0;
        for (int i=0; i<password.length(); i++){
            if(password.charAt(i)>='0'&&password.charAt(i)<='9'){
                countDigits++;
            }
        }
        return countDigits>=2;
    }
}
