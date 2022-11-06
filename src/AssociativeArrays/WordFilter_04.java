package AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] input = Arrays.stream(sc.nextLine().split(" ")).filter(s -> s.length()%2==0).toArray(String[]::new);
        for (String word:input){
            System.out.println(word);
        }
    }
}
