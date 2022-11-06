package AssociativeArrays;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        List<String> wordsToPrint = new ArrayList<>();
        String [] input = sc.nextLine().split("\\s+");
        for(String word:input){
            String wordLower = word.toLowerCase();
            if(!wordsMap.containsKey(wordLower)){
                wordsMap.put(wordLower,1);
            }
            else{
                wordsMap.put(wordLower,wordsMap.get(wordLower)+1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if(entry.getValue()%2!=0){
                wordsToPrint.add(entry.getKey());
            }
        }
        System.out.print(String.join(", ", wordsToPrint));
    }
}
