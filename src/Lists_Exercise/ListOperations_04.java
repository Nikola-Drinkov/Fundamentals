package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = sc.nextLine();
        while (!input.equals("End")){
            String [] command = input.split("\\s+");
            if(input.contains("Add")){
                int numToAdd = Integer.parseInt(command[1]);
                numbersList.add(numToAdd);
            }
            else if(input.contains("Insert")){
                int numToAdd = Integer.parseInt(command[1]);
                int index = Integer.parseInt(command[2]);
                if(checkIndex(index,numbersList)){
                    numbersList.add(index,numToAdd);
                }
                else printInvalid();
            }
            else if(input.contains("Remove")){
                int index = Integer.parseInt(command[1]);
                if(checkIndex(index,numbersList)){
                    numbersList.remove(index);
                }
                else{
                    printInvalid();
                }
            }
            else if(input.contains("Shift left")){
                int count = Integer.parseInt(command[2]);
                for(int i=0; i<count; i++){
                    int firstNum = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(firstNum);
                }
            }
            else if(input.contains("Shift right")){
                int count = Integer.parseInt(command[2]);
                for(int i=0; i<count; i++){
                    int lastNum = numbersList.get(numbersList.size()-1);
                    numbersList.remove(numbersList.size()-1);
                    numbersList.add(0,lastNum);
                }
            }
            input = sc.nextLine();
        }
        for(int item:numbersList){
            System.out.print(item+" ");
        }
    }
    public static boolean checkIndex(int index,List<Integer> numbersList){
        return index>=0&&index<numbersList.size();
    }
    public static void printInvalid(){
        System.out.println("Invalid index");
    }
}
