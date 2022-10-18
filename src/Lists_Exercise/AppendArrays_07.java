package Lists_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arraysSeparated = Arrays.stream(sc.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(arraysSeparated);
        System.out.println(arraysSeparated.toString().replace("[","").replace("]","").replaceAll(",","").replaceAll("\\s+"," ").trim());
    }
}
