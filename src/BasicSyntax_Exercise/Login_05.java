package BasicSyntax_Exercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();
        String password = "";
        String input = sc.nextLine();
        int wrong = 0;

        for(int position=username.length()-1; position>=0; position--){
            char currentChar = username.charAt(position);
            password += currentChar;
        }

        while (!input.equals(password)){
            wrong++;
            if(wrong==4){
                System.out.printf("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = sc.nextLine();
        }
        if (input.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }

    }
}
