package TextProcessing_Exercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        String file = path.substring(path.lastIndexOf("\\")+1);
        String name = file.split("\\.")[0];
        String extension = file.split("\\.")[1];
        System.out.printf("File name: %s%n",name);
        System.out.printf("File extension: %s%n",extension);
    }
}
