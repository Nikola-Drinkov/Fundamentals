package AssociativeArr_Exercise;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, List<String>> employeeMap = new LinkedHashMap<>();
        String input = sc.nextLine();
        while(!input.equals("End")){
            String company = input.split(" -> ")[0];
            String employee = input.split(" -> ")[1];
            if(!employeeMap.containsKey(company)){
                employeeMap.put(company,new ArrayList<>());
            }
            if(!employeeMap.get(company).contains(employee)){
                employeeMap.get(company).add(employee);
            }
            input=sc.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey());
            for(String employee:entry.getValue()){
                System.out.printf("-- %s%n",employee);
            }
        }

    }
}
