package ClassesObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    public static class Student{
        private String firstName;
        private String lastName;
        private String age;
        private String hometown;

        public Student(String firstName, String lastName, String age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getHometown() {
            return hometown;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();
        String input = sc.nextLine();
        while (!input.equals("end")){
            String [] currentStudent =  input.split(" ");
            Student s = new Student(currentStudent[0],currentStudent[1],currentStudent[2],currentStudent[3]);
            studentsList.add(s);
            input= sc.nextLine();
        }
        String city = sc.nextLine();
        for(Student student:studentsList){
            if(student.getHometown().equals(city)){
                System.out.printf("%s %s is %s years old%n",student.getFirstName(),student.getLastName(),student.getAge());
            }
        }

    }
}
