package Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> studentsList = new ArrayList<>();
        for(int i=0; i<n; i++){
            String [] data = sc.nextLine().split(" ");
            String firstName = data[0];
            String lastName = data[1];
            double grade = Double.parseDouble(data[2]);
            Student student = new Student(firstName,lastName,grade);
            studentsList.add(student);
        }
        studentsList.sort(Comparator.comparing(Student::getGrade).reversed());
        for(Student s:studentsList){
            System.out.println(s);
        }
    }
}
