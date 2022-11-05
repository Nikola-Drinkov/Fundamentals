package AssociativeArr_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String,String> carsMap = new LinkedHashMap<>();
        for(int i=0; i<n; i++){
            String command = sc.nextLine();
            if(command.split("\\s+")[0].equals("register")){
                String username = command.split("\\s+")[1];
                String plate = command.split("\\s+")[2];
                if(!carsMap.containsKey(username)){
                    carsMap.put(username,plate);
                    System.out.printf("%s registered %s successfully%n",username,plate);
                }
                else{
                    System.out.printf("ERROR: already registered with plate number %s%n",carsMap.get(username));
                }
            }
            else if(command.split("\\s+")[0].equals("unregister")){
                String username = command.split("\\s+")[1];
                if(!carsMap.containsKey(username)){
                    System.out.printf("ERROR: user %s not found%n",username);
                }
                else {
                    carsMap.remove(username);
                    System.out.printf("%s unregistered successfully%n",username);
                }
            }
        }
        for (Map.Entry<String, String> entry : carsMap.entrySet()) {
            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());
        }

    }
}
