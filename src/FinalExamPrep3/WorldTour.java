package FinalExamPrep3;
import java.util.Scanner;
public class WorldTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        StringBuilder textBuilder = new StringBuilder(text);
        String input = sc.nextLine();
        while (!input.equals("Travel")){
            String [] inputArr = input.split(":");
            String command = inputArr[0];
            switch (command){
                case"Add Stop":
                    int indexAdd = Integer.parseInt(inputArr[1]);
                    String toAdd = inputArr[2];
                    if(isValid(textBuilder.toString(),indexAdd)){
                        textBuilder = textBuilder.insert(indexAdd,toAdd);
                    }
                    System.out.println(textBuilder);
                    break;
                case"Remove Stop":
                    int indexStart = Integer.parseInt(inputArr[1]);
                    int indexEnd = Integer.parseInt(inputArr[2]);
                    if(isValid(textBuilder.toString(),indexStart)&&isValid(textBuilder.toString(),indexEnd)){
                        textBuilder = textBuilder.replace(indexStart,indexEnd+1,"");
                    }
                    System.out.println(textBuilder);
                    break;
                case"Switch":
                    String oldStr = inputArr[1];
                    String newStr = inputArr[2];
                    if(textBuilder.toString().contains(oldStr)){
                        textBuilder = new StringBuilder(textBuilder.toString().replace(oldStr, newStr));
                    }
                    System.out.println(textBuilder);
                    break;
            }
            input = sc.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: "+textBuilder);
    }
    public static boolean isValid(String text, int index){
        return index >= 0 && index < text.length();
    }
}
