package AssociativeArr_Exercise;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, List<String>> usersMap = new LinkedHashMap<>();
        String input = sc.nextLine();
        while(!input.equals("Lumpawaroo")){
            if(input.contains("|")){
                String side = input.split(" \\| ")[0];
                String user = input.split(" \\| ")[1];
               if(!usersMap.containsKey(side)){
                   usersMap.put(side,new ArrayList<>());
               }
                boolean isExisting = false;
               for(List<String> list:usersMap.values()){
                   if (list.contains(user)) {
                       isExisting = true;
                       break;
                   }
               }
               if(!isExisting){
                   usersMap.get(side).add(user);
               }
            }
            else if (input.contains("->")) {
                String user = input.split(" -> ")[0];
                String side = input.split(" -> ")[1];
                for(List<String> list:usersMap.values()){
                    list.remove(user);
                }
                if(!usersMap.containsKey(side)){
                    usersMap.put(side,new ArrayList<>());
                    usersMap.get(side).add(user);
                }
                else{
                    usersMap.get(side).add(user);
                }
                System.out.printf("%s joins the %s side!%n",user,side);
            }
            input= sc.nextLine();
        }
        usersMap.entrySet().stream().filter(entry -> entry.getValue().size()>0)
                .forEach(entry -> {System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
                                    entry.getValue().forEach(user -> System.out.printf("! %s%n", user));
                });
    }
}
