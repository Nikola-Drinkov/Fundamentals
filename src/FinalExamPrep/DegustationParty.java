package FinalExamPrep;

import java.util.*;

public class DegustationParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> guestsMap = new LinkedHashMap<>();
        int totalDisliked = 0;

        String input = sc.nextLine();
        while (!input.equals("Stop")){
            String command = input.split("-")[0];
            String guest = input.split("-")[1];
            String meal = input.split("-")[2];

            switch (command){
                case"Like":
                    if(!guestsMap.containsKey(guest)){
                        guestsMap.put(guest,new ArrayList<>());
                        guestsMap.get(guest).add(meal);
                    }
                    else if (guestsMap.containsKey(guest) && !guestsMap.get(guest).contains(meal)){
                        guestsMap.get(guest).add(meal);
                    }
                    break;
                case"Dislike":
                    if(!guestsMap.containsKey(guest)){
                        System.out.printf("%s is not at the party.%n",guest);
                    }
                    else if(guestsMap.containsKey(guest) && !guestsMap.get(guest).contains(meal)){
                        System.out.printf("%s doesn't have the %s in his/her collection.%n",guest,meal);
                    }
                    else{
                        guestsMap.get(guest).remove(meal);
                        totalDisliked++;
                        System.out.printf("%s doesn't like %s.%n",guest,meal);
                    }
                    break;
            }
            input = sc.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : guestsMap.entrySet()) {
            System.out.printf("%s: ",entry.getKey());
            System.out.println(String.join(", ",entry.getValue()));
        }
        System.out.printf("Unliked meals: %d%n",totalDisliked);

    }
}
