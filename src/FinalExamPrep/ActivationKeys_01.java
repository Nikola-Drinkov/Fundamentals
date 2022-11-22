package FinalExamPrep;

import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String input = sc.nextLine();
        while (!input.equals("Generate")){
            String [] command = input.split(">>>");
            switch (command[0]){
                case"Contains":
                    String substring = command[1];
                    if(key.contains(substring))
                        System.out.printf("%s contains %s%n",key,substring);
                    else
                        System.out.println("Substring not found!");
                    break;
                case"Flip":
                    int startIndex = Integer.parseInt(command[2]);
                    int endIndex = Integer.parseInt(command[3]);
                    if(command[1].equals("Upper")){
                        String subs = key.substring(startIndex,endIndex);
                        String newSub = subs.toUpperCase();
                        key = key.replace(subs,newSub);
                        System.out.println(key);
                    }
                    else if(command[1].equals("Lower")){
                        String subs = key.substring(startIndex,endIndex);
                        String newSub = subs.toLowerCase();
                        key = key.replace(subs,newSub);
                        System.out.println(key);
                    }
                    break;
                case"Slice":
                    int startIndexS = Integer.parseInt(command[1]);
                    int endIndexS = Integer.parseInt(command[2]);
                    String subS = key.substring(startIndexS,endIndexS);
                    key = key.replace(subS,"");
                    System.out.println(key);
                    break;
            }
            input = sc.nextLine();
        }
        System.out.printf("Your activation key is: %s",key);
    }
}
