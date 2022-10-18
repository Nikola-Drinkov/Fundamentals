package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> firstHand = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondHand = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (firstHand.size()!=0&&secondHand.size()!=0) {
            int firstHandCard = firstHand.get(0);
            int secondHandCard = secondHand.get(0);
            if (firstHandCard > secondHandCard) {
                firstHand.remove(0);
                secondHand.remove(0);
                firstHand.add(firstHandCard);
                firstHand.add(secondHandCard);
            } else if (secondHandCard > firstHandCard) {
                firstHand.remove(0);
                secondHand.remove(0);
                secondHand.add(secondHandCard);
                secondHand.add(firstHandCard);
            }
            else{
                firstHand.remove(0);
                secondHand.remove(0);
            }
        }
            if(firstHand.size()==0) {
                int sum = 0;
                for(int item:secondHand){
                    sum+=item;
                }
                System.out.printf("Second player wins! Sum: %d",sum);
            }
        else {
            int sum = 0;
            for(int item:firstHand){
                sum+=item;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }
        }
    }
