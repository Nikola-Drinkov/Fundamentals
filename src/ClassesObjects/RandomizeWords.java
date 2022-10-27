package ClassesObjects;


import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");
        Random rnd = new Random();
        for(int i=0; i<input.length;i++){
            int rndNum = rnd.nextInt(input.length);
            String oldWord = input[i];
            input[i] = input[rndNum];
            input[rndNum] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(),input));
    }
}
