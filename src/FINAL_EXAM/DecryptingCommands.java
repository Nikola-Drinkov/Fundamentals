package FINAL_EXAM;

import java.util.Scanner;

public class DecryptingCommands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder textBuilder = new StringBuilder(sc.nextLine());
        String input = sc.nextLine();
        while (!input.equals("Finish")){
            String [] inputArr = input.split(" ");
            String command = inputArr[0];
            switch (command){
                case"Replace":
                    String currentChar = inputArr[1];
                    String newChar = inputArr[2];
                    if(textBuilder.toString().contains(currentChar)){
                        textBuilder = new StringBuilder(textBuilder.toString().replace(currentChar, newChar));
                        System.out.println(textBuilder);
                    }
                    break;
                case"Cut":
                    int startIndex = Integer.parseInt(inputArr[1]);
                    int endIndex = Integer.parseInt(inputArr[2]);
                    if(isValid(textBuilder.toString(),startIndex)&&isValid(textBuilder.toString(),endIndex)){
                        textBuilder = textBuilder.replace(startIndex,endIndex+1,"");
                        System.out.println(textBuilder);
                    }
                    else{
                        System.out.println("Invalid indices!");
                    }
                    break;
                case"Make":
                    String type = inputArr[1];
                    if(type.equals("Upper")){
                        textBuilder = new StringBuilder(textBuilder.toString().toUpperCase());
                    }
                    else if(type.equals("Lower")){
                        textBuilder = new StringBuilder(textBuilder.toString().toLowerCase());
                    }
                    System.out.println(textBuilder);
                    break;
                case"Check":
                    String sub = inputArr[1];
                    if(textBuilder.toString().contains(sub)){
                        System.out.println("Message contains "+sub);
                    }
                    else{
                        System.out.println("Message doesn't contain "+sub);
                    }
                    break;
                case"Sum":
                    int startInd = Integer.parseInt(inputArr[1]);
                    int endInd = Integer.parseInt(inputArr[2]);
                    String substr = "";
                    int sum = 0;
                    if(isValid(textBuilder.toString(),startInd)&&isValid(textBuilder.toString(),endInd)){
                        substr = textBuilder.substring(startInd,endInd+1);
                        for (int i=0; i<substr.length(); i++){
                            sum = sum + (int)substr.charAt(i);
                        }
                        System.out.println(sum);
                    }
                    else{
                        System.out.println("Invalid indices!");
                    }
                    break;
            }
            input = sc.nextLine();
        }
    }
    public static boolean isValid(String text, int index){
        return index>=0&&index<text.length();
    }
}
