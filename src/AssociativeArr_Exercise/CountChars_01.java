package AssociativeArr_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        LinkedHashMap<Character,Integer> charMap = new LinkedHashMap<>();
        for(char c : text.toCharArray()){
            if(c==' ') {
                continue;
            }
            if(!charMap.containsKey(c)){
                charMap.put(c,1);
            }
            else{
                int value = charMap.get(c);
                charMap.put(c, value+1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

    }
}
