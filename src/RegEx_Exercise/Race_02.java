package RegEx_Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> participants = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        LinkedHashMap<String, Integer> runnersDistance = new LinkedHashMap<>();

        String input = sc.nextLine();
        while(!input.equals("end of race")){

            String letterRegex = "[A-Za-z]+";
            Pattern letterPattern = Pattern.compile(letterRegex);
            Matcher letterMatcher = letterPattern.matcher(input);
            StringBuilder name = new StringBuilder();
            while(letterMatcher.find()){
                name.append(letterMatcher.group());
            }

            int distance = 0;
            String digitRegex = "[0-9]";
            Pattern digitPattern = Pattern.compile(digitRegex);
            Matcher digitMatcher = digitPattern.matcher(input);
            while(digitMatcher.find()){
                distance+=Integer.parseInt(digitMatcher.group());
            }
            if(participants.contains(name.toString())){
                if(!runnersDistance.containsKey(name.toString()))
                runnersDistance.put(name.toString(),distance);
                else runnersDistance.put(name.toString(), runnersDistance.get(name.toString())+distance);
            }
            input=sc.nextLine();
        }
        List<String> top3Names = runnersDistance.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey).collect(Collectors.toList());
       for(int i=0; i<top3Names.size();i++){
           if(i==0){
               System.out.println("1st place: "+top3Names.get(0));
           }
           else if(i==1){
               System.out.println("2nd place: "+top3Names.get(1));
           }
           else if(i==2){
               System.out.println("3rd place: "+top3Names.get(2));
           }
       }
    }
}
