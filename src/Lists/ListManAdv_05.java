package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManAdv_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = sc.nextLine();
        while(!input.equals("end")){
            String[] commandArr = input.split(" ");
            switch (commandArr[0]){
                case"Contains":
                    if(numbersList.contains(Integer.parseInt(commandArr[1]))){
                        System.out.println("Yes");
                    }
                    else System.out.println("No such number");
                    break;
                case"Print":
                    switch (commandArr[1]){
                        case"even":
                            List<Integer> evenList = new ArrayList<>();
                            for (int value : numbersList) {
                                if (value % 2 == 0) {
                                    evenList.add(value);
                                }
                            }
                            for(int item:evenList){
                                System.out.print(item+" ");
                            }
                            System.out.println();
                            break;
                        case"odd":
                            List<Integer> oddList = new ArrayList<>();
                            for (int value : numbersList) {
                                if (value % 2 != 0) {
                                    oddList.add(value);
                                }
                            }
                            for(int item:oddList){
                                System.out.print(item+" ");
                            }
                            System.out.println();
                            break;
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for(int value: numbersList){
                        sum+=value;
                    }
                    System.out.println(sum);
                    break;
                case"Filter":
                    switch (commandArr[1]){
                        case"<":
                            for(int item: numbersList){
                                if(item<Integer.parseInt(commandArr[2])){
                                    System.out.print(item+" ");
                                }
                            }
                            System.out.println();
                            break;
                        case">":
                            for(int item: numbersList){
                                if(item>Integer.parseInt(commandArr[2])){
                                    System.out.print(item+" ");
                                }
                            }
                            System.out.println();
                            break;
                        case">=":
                            for(int item: numbersList){
                                if(item>=Integer.parseInt(commandArr[2])){
                                    System.out.print(item+" ");
                                }
                            }
                            System.out.println();
                            break;
                        case"<=":
                            for(int item: numbersList){
                                if(item<=Integer.parseInt(commandArr[2])){
                                    System.out.print(item+" ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }
            input = sc.nextLine();
        }
    }
}