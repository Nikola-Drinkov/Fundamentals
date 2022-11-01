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

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }
    private static boolean isStudentExisting(List<Student> studentsList,String firstName, String lastName){
        for(Student student:studentsList){
            if(student.getFirstName().equals(firstName)&&student.getLastName().equals(lastName))
                return true;
        }
        return false;
    }
    private static Student getStudent(List<Student> studentsList, String firstName, String lastName){
        Student existingStudent = null;
        for(Student student:studentsList){
            if(student.getFirstName().equals(firstName)&&student.getLastName().equals(lastName))
                existingStudent=student;
        }
        return existingStudent;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();
        String input = sc.nextLine();
        while (!input.equals("end")){
            String [] currentStudent =  input.split(" ");
            if(!isStudentExisting(studentsList,currentStudent[0],currentStudent[1])){
                Student s = new Student(currentStudent[0],currentStudent[1],currentStudent[2],currentStudent[3]);
                studentsList.add(s);
            }
            else {
                Student student = getStudent(studentsList,currentStudent[0],currentStudent[1]);
                student.setFirstName(currentStudent[0]);
                student.setLastName(currentStudent[1]);
                student.setAge(currentStudent[2]);
                student.setHometown(currentStudent[3]);
            }
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
