package FinalExamPrep;

import java.util.*;

public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, Integer> plantsRarityMap = new LinkedHashMap<>();
        LinkedHashMap<String, Double> plantsRatingMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> plantsRatingCount = new LinkedHashMap<>();
        for(int i=0; i<n; i++){
            String plantData = sc.nextLine();
            String plant = plantData.split("<->")[0];
            int rarity = Integer.parseInt(plantData.split("<->")[1]);
            plantsRarityMap.put(plant,rarity);
            plantsRatingMap.put(plant,0.00);
            plantsRatingCount.put(plant,0);
        }

        String input = sc.nextLine();
        while(!input.equals("Exhibition")){
            String command = input.split("[: -]+")[0];
            String plant = input.split("[: -]+")[1];

            if(!plantsRarityMap.containsKey(plant)){
                System.out.println("error");
            }
            else {
                switch (command) {
                    case "Rate":
                        double rating = Double.parseDouble(input.split("[: -]+")[2]);
                        plantsRatingCount.put(plant,plantsRatingCount.get(plant)+1);
                        if(plantsRatingMap.get(plant)==0){
                            plantsRatingMap.put(plant,rating);
                        }
                        else{
                            double newRating = (plantsRatingMap.get(plant)+rating)/plantsRatingCount.get(plant);
                            plantsRatingMap.put(plant,newRating);
                        }
                        break;
                    case "Update":
                        int rarity = Integer.parseInt(input.split("[: -]+")[2]);
                        plantsRarityMap.put(plant,rarity);
                        break;
                    case "Reset":
                        plantsRatingMap.put(plant,0.00);
                        break;
                }
            }
            input = sc.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantsRarityMap.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",entry.getKey(),entry.getValue(),plantsRatingMap.get(entry.getKey()));
        }
    }
}
