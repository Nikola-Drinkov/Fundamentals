package AssociativeArr_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> quantityMap = new LinkedHashMap<>();
        LinkedHashMap<String, Double> priceMap = new LinkedHashMap<>();
        String input = sc.nextLine();
        while (!input.equals("buy")){
            String name = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if(!quantityMap.containsKey(name)){
                quantityMap.put(name,quantity);
                priceMap.put(name,price);
            }
            else{
                int currentCount = quantityMap.get(name);
                quantityMap.put(name,currentCount+quantity);
                priceMap.put(name,price);
            }
            input= sc.nextLine();
        }
        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            String name = entry.getKey();
            double totalPrice = entry.getValue()*quantityMap.get(name);
            System.out.printf("%s -> %.2f%n",name,totalPrice);
           // I love you mecane!
        }
    }
}
