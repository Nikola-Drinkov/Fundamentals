package FinalExamPrep3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder message = new StringBuilder(sc.nextLine());
        String input = sc.nextLine();
        while (!input.equals("Reveal")){
            String [] inputArr = input.split(":\\|:");
            String command = inputArr[0];
            switch (command){
                case"InsertSpace":
                    int index = Integer.parseInt(inputArr[1]);
                    message = message.insert(index," ");
                    System.out.println(message);
                    break;
                case"Reverse":
                    String substring = inputArr[1];
                    if(message.toString().contains(substring)){
                        message = new StringBuilder(message.toString().replaceFirst(Pattern.quote(substring), ""));
                        StringBuilder reversed = new StringBuilder(substring);
                        reversed = reversed.reverse();
                        message.append(reversed);
                        System.out.println(message);
                    }
                    else{
                        System.out.println("error");
                    }
                    break;
                case"ChangeAll":
                    String sub = inputArr[1];
                    String replacement = inputArr[2];
                    message = new StringBuilder(message.toString().replace(sub, replacement));
                    System.out.println(message);
                    break;
            }
            input = sc.nextLine();
        }
        System.out.println("You have a new text message: "+message);
    }
}
