package AssociativeArr_Exercise;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, List<Double>> studentsMap = new LinkedHashMap<>();
        for(int i=0; i<n; i++){
            String name = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());
            if(!studentsMap.containsKey(name)){
                studentsMap.put(name,new ArrayList<>());
            }
            studentsMap.get(name).add(grade);
        }
        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            double sum=0;
            for(double grade:entry.getValue()){
                sum+=grade;
            }
            double average = sum/entry.getValue().size();
            if(average>=4.50){
                System.out.printf("%s -> %.2f%n",entry.getKey(),average);
            }
        }

    }
}
