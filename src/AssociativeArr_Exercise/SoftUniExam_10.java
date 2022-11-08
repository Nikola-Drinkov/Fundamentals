package AssociativeArr_Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniExam_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> usersMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> languagesMap = new LinkedHashMap<>();
        String input = sc.nextLine();
        while (!input.equals("exam finished")){
           String [] data = input.split("-");
           if(data.length==3){
                String username = data[0];
                String language = data[1];
                int points = Integer.parseInt(data[2]);
                if(!usersMap.containsKey(username)){
                    usersMap.put(username,points);
                }
                else {
                    if(points>usersMap.get(username)){
                        usersMap.put(username,points);
                    }
                }
                if(!languagesMap.containsKey(language)){
                    languagesMap.put(language,1);
                }
                else{
                    languagesMap.put(language,languagesMap.get(language)+1);
               }
           }
           else if (data.length==2) {
               String usernameToBan = data[0];
               usersMap.remove(usernameToBan);
           }
            input= sc.nextLine();
        }
        System.out.println("Results:");
        usersMap.entrySet().forEach(user -> System.out.printf("%s | %d%n",user.getKey(),user.getValue()));
        System.out.println("Submissions:");
        languagesMap.entrySet().forEach(entry -> System.out.printf("%s - %d%n",entry.getKey(),entry.getValue()));
    }
}
