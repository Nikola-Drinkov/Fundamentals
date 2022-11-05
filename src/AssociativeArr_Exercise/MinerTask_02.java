package AssociativeArr_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Integer> resourcesMap = new LinkedHashMap<>();
        String input = sc.nextLine();
        while(!input.equals("stop")){
            String ore = input;
            int count = Integer.parseInt(sc.nextLine());
            if(!resourcesMap.containsKey(ore)){
                resourcesMap.put(ore,count);
            }
            else{
                int currentCount = resourcesMap.get(ore);
                resourcesMap.put(ore,currentCount+count);
            }
            input = sc.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
