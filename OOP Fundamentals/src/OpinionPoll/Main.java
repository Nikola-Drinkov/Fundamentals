package OpinionPoll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String data = sc.nextLine();
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);
            if(age>30) {
                Person person = new Person(name, age);
                System.out.println(person);
            }
        }
    }
}
