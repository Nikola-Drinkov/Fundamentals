package OrderByAge;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> peopleList = new ArrayList<>();
        String input = sc.nextLine();
        while(!input.equals("End")){
            String [] data = input.split(" ");
            Person person = new Person(data[0],data[1],Integer.parseInt(data[2]));
            peopleList.add(person);
            input = sc.nextLine();
        }
        peopleList.sort(Comparator.comparing(Person::getAge));
        for(Person person:peopleList){
            System.out.println(person);
        }
    }
}
