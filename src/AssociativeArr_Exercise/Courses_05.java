package AssociativeArr_Exercise;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> courseMap = new LinkedHashMap<>();
        LinkedHashMap<String, List<String>> studentsMap = new LinkedHashMap<>();
        String input = sc.nextLine();
        while(!input.equals("end")){
            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];
            if(!courseMap.containsKey(course)){
                courseMap.put(course,1);
                studentsMap.put(course,new ArrayList<>());
                studentsMap.get(course).add(student);
            }
            else{
                int currentCount = courseMap.get(course);
                courseMap.put(course,currentCount+1);
                studentsMap.get(course).add(student);
            }

            input=sc.nextLine();
        }
        for (Map.Entry<String, Integer> entry : courseMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            String course = entry.getKey();
            for (String student : studentsMap.get(course)) {
                System.out.printf("-- %s%n",student);
            }
        }
    }
}
