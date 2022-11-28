package FinalExamPrep3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, String> composerMap = new LinkedHashMap<>();
        LinkedHashMap<String, String> keyMap = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String [] input = sc.nextLine().split("\\|");
            String piece = input[0];
            String composer = input[1];
            String key = input[2];
            composerMap.put(piece,composer);
            keyMap.put(piece,key);
        }
        String input = sc.nextLine();
        while (!input.equals("Stop")){
            String [] inputArr = input.split("\\|");
            String command = inputArr[0];
            String piece = inputArr[1];
            switch (command){
                case"Add":
                    String composer = inputArr[2];
                    String key = inputArr[3];
                    if(!composerMap.containsKey(piece)){
                        composerMap.put(piece,composer);
                        keyMap.put(piece,key);
                        System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);
                    }
                    else{
                        System.out.printf("%s is already in the collection!%n",piece);
                    }
                    break;
                case"Remove":
                    if(composerMap.containsKey(piece)){
                        composerMap.remove(piece);
                        keyMap.remove(piece);
                        System.out.printf("Successfully removed %s!%n",piece);
                    }
                    else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                    }
                    break;
                case"ChangeKey":
                    String newKey = inputArr[2];
                    if(keyMap.containsKey(piece)){
                        keyMap.put(piece,newKey);
                        System.out.printf("Changed the key of %s to %s!%n",piece,newKey);
                    }
                    else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                    }
            }
            input = sc.nextLine();
        }
        for (Map.Entry<String, String> entry : composerMap.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue(),keyMap.get(entry.getKey()));
        }

    }
}
