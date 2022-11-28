package FinalExamPrep2;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rawPass = sc.nextLine();
        String command = sc.nextLine();
        while (!command.equals("Done")){
            StringBuilder newPassword = new StringBuilder();
            if(command.equals("TakeOdd")){
                for(int i=1; i<=rawPass.length()-1; i+=2){
                    newPassword.append(rawPass.charAt(i));
                }
                System.out.println(newPassword);
            }
            else if(command.contains("Cut")){
                int index = Integer.parseInt(command.split(" ")[1]);
                int length = Integer.parseInt(command.split(" ")[2]);
                String sub = rawPass.substring(index,index+length);
                newPassword = new StringBuilder(rawPass.replaceFirst(sub, ""));
                System.out.println(newPassword);
            }
            else if(command.contains("Substitute")){
                String subStr = command.split(" ")[1];
                String substitute = command.split(" ")[2];
                if(rawPass.contains(subStr)){
                    newPassword = new StringBuilder(rawPass.replaceAll(subStr,substitute));
                    System.out.println(newPassword);
                }
                else{
                    System.out.println("Nothing to replace!");
                    newPassword = new StringBuilder(rawPass);
                }
            }
            rawPass = newPassword.toString();
            command = sc.nextLine();
        }
        System.out.println("Your password is: "+rawPass);
    }
}
