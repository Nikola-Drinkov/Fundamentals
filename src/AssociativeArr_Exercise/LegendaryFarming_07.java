package AssociativeArr_Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> keyResourcesMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> junkMap = new LinkedHashMap<>();
        keyResourcesMap.put("shards",0);
        keyResourcesMap.put("fragments",0);
        keyResourcesMap.put("motes",0);
        boolean isWin = false;
        while(!isWin){
            String [] data = sc.nextLine().split(" ");
            for(int i=0; i<data.length;i+=2) {
                int quantity = Integer.parseInt(data[i]);
                String material = data[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentCount = keyResourcesMap.get(material);
                    keyResourcesMap.put(material, currentCount + quantity);
                } else {
                    if (!junkMap.containsKey(material)) {
                        junkMap.put(material, quantity);
                    } else {
                        int currentCount = junkMap.get(material);
                        junkMap.put(material, currentCount + quantity);
                    }
                }

                if (keyResourcesMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    keyResourcesMap.put("shards", keyResourcesMap.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (keyResourcesMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    keyResourcesMap.put("fragments", keyResourcesMap.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (keyResourcesMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    keyResourcesMap.put("motes", keyResourcesMap.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
            if(isWin){
                break;
            }
        }
        keyResourcesMap.forEach((key1, value1) -> System.out.printf("%s: %d%n", key1, value1));
        junkMap.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }
}
