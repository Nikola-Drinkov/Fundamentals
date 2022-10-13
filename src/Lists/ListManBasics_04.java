package Lists;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManBasics_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = sc.nextLine();
        while(!input.equals("end")){
            String[] commandArr = input.split(" ");
            switch (commandArr[0]){
                case"Add":
                    numbersList.add(Integer.parseInt(commandArr[1]));
                    break;
                case"Remove":
                    numbersList.remove(Integer.valueOf(commandArr[1]));
                    break;
                case"RemoveAt":
                    numbersList.remove(Integer.parseInt(commandArr[1]));
                    break;
                case"Insert":
                    numbersList.add(Integer.parseInt(commandArr[2]),Integer.parseInt(commandArr[1]));
                    break;
            }
            input = sc.nextLine();
        }
        for(int item:numbersList){
            System.out.print(item+" ");
        }
    }
}
