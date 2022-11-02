package AssociativeArrays;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> synonymMap = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n;i++){
            String word = sc.nextLine();
            String synonym = sc.nextLine();
            if(!synonymMap.containsKey(word)){
                synonymMap.put(word, new ArrayList<>());
            }
                synonymMap.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>> entry : synonymMap.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ", entry.getValue()));
        }
    }
}
