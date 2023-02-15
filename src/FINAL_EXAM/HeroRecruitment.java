package FINAL_EXAM;
import java.util.*;

public class HeroRecruitment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, List<String>> spellbook = new LinkedHashMap<>();
        String input = sc.nextLine();
        while (!input.equals("End")){
            String [] inputArr = input.split(" ");
            String command = inputArr[0];
            String hero = inputArr[1];
            switch(command){
                case"Enroll":
                    if(!spellbook.containsKey(hero)){
                        spellbook.put(hero,new ArrayList<>());
                    }
                    else{
                        System.out.println(hero+" is already enrolled.");
                    }
                    break;
                case"Learn":
                    String spellLearn = inputArr[2];
                    if(!spellbook.containsKey(hero)){
                        System.out.println(hero+" doesn't exist.");
                    }
                    else {
                        if (spellbook.get(hero).contains(spellLearn)) {
                            System.out.println(hero + " has already learnt " + spellLearn + ".");
                        } else {
                            spellbook.get(hero).add(spellLearn);
                        }
                    }
                    break;
                case"Unlearn":
                    String spellUnlearn = inputArr[2];
                    if(!spellbook.containsKey(hero)){
                        System.out.println(hero+" doesn't exist.");
                    }
                    else {
                        if (!spellbook.get(hero).contains(spellUnlearn)) {
                            System.out.println(hero + " doesn't know " + spellUnlearn + ".");
                        } else {
                            spellbook.get(hero).remove(spellUnlearn);
                        }
                    }
                    break;
            }
            input = sc.nextLine();
        }
        System.out.println("Heroes:");
        for (Map.Entry<String, List<String>> entry : spellbook.entrySet()) {
            System.out.print("== "+entry.getKey()+": ");
            System.out.println(String.join(", ",entry.getValue()));
        }
    }
}
