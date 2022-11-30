package FinalExamPrep3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> populationMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goldMap = new LinkedHashMap<>();

        String input = sc.nextLine();
        while (!input.equals("Sail")){
            String [] inputArr = input.split("\\|\\|");
            String city = inputArr[0];
            int population = Integer.parseInt(inputArr[1]);
            int gold = Integer.parseInt(inputArr[2]);
            if(!populationMap.containsKey(city)){
                populationMap.put(city,population);
            }
            else{
                populationMap.put(city,populationMap.get(city)+population);
            }
            if(!goldMap.containsKey(city)){
                goldMap.put(city,gold);
            }
            else{
                goldMap.put(city,goldMap.get(city)+gold);
            }

            input=sc.nextLine();
        }
        String input1 = sc.nextLine();
        while (!input1.equals("End")){
            String [] input1Arr = input1.split("=>");
            String command = input1Arr[0];
            String town = input1Arr[1];
            switch (command){
                case"Plunder":
                    int people  = Integer.parseInt(input1Arr[2]);
                    int gold = Integer.parseInt(input1Arr[3]);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,gold,people);
                    populationMap.put(town,populationMap.get(town)-people);
                    goldMap.put(town,goldMap.get(town)-gold);
                    if(populationMap.get(town)<=0||goldMap.get(town)<=0){
                       populationMap.remove(town);
                       populationMap.remove(town);
                       System.out.printf("%s has been wiped off the map!%n",town);
                    }
                    break;
                case"Prosper":
                    int goldPros = Integer.parseInt(input1Arr[2]);

                    if(goldPros<0){
                        System.out.println("Gold added cannot be a negative number!");
                    }
                        else{
                        goldMap.put(town,goldMap.get(town)+goldPros);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",goldPros,town,goldMap.get(town));
                    }
            }
            input1 = sc.nextLine();
        }
        if(populationMap.size()>0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",populationMap.size());
            for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue(), goldMap.get(entry.getKey()));
            }
        }
        else{
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
