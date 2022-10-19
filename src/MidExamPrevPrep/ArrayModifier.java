package MidExamPrevPrep;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numbersArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = sc.nextLine();
        while (!input.equals("end")){
            String [] command = input.split(" ");
            switch (command[0]){
                case"swap":
                    int firstIndex = Integer.parseInt(command[1]);
                    int secondIndex = Integer.parseInt(command[2]);

                    int valueAtFirstI = numbersArr[firstIndex];
                    int valueAtSecondI = numbersArr[secondIndex];

                    numbersArr[firstIndex]=valueAtSecondI;
                    numbersArr[secondIndex]=valueAtFirstI;
                    break;
                case"multiply":
                    int multiplyFirstIndex = Integer.parseInt(command[1]);
                    int multiplySecondIndex = Integer.parseInt(command[2]);
                    numbersArr[multiplyFirstIndex] = numbersArr[multiplyFirstIndex]*numbersArr[multiplySecondIndex];
                    break;
                case"decrease":
                    for(int i=0; i<numbersArr.length;i++){
                        numbersArr[i]-=1;
                    }
            }
            input=sc.nextLine();
        }
        for(int i=0; i<numbersArr.length;i++){
            if(i==numbersArr.length-1){
                System.out.print(numbersArr[i]);
            }
            else {
                System.out.print(numbersArr[i] + ", ");
            }
        }
    }
}
