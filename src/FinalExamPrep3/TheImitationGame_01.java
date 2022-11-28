package FinalExamPrep3;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();
        StringBuilder messageBuilder;
        String input = sc.nextLine();
        while(!input.equals("Decode")){
            String [] inputArr = input.split("\\|");
            String command = inputArr[0];
            switch(command){
                case"Move":
                    int numLetters = Integer.parseInt(inputArr[1]);
                    String subMove = message.substring(0,numLetters);
                    message = message.replace(subMove,"");
                    message = message.concat(subMove);
                    break;
                case"Insert":
                    int index = Integer.parseInt(inputArr[1]);
                    String value = inputArr[2];
                    messageBuilder = new StringBuilder(message);
                    messageBuilder.insert(index,value);
                    message = messageBuilder.toString();
                    break;
                case"ChangeAll":
                    String subChange = inputArr[1];
                    String replacement = inputArr[2];
                    message = message.replace(subChange,replacement);
                    break;
            }
            input = sc.nextLine();
        }
        System.out.printf("The decrypted message is: %s",message);
    }
}
