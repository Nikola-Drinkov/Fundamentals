package MidExamPrevPrep;
import java.util.Scanner;

public class CS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startingEnergy = Integer.parseInt(sc.nextLine());
        int count=0;
        String input = sc.nextLine();
        while (end(input,count,startingEnergy)){
            int distance = Integer.parseInt(input);
            startingEnergy-=distance;
            count++;
            if (startingEnergy < 0){
                print(count,startingEnergy,distance);
                break;
            }
            if (count%3==0){
                startingEnergy+=count;
            }

            input = sc.nextLine();
        }
    }
    public static boolean end(String input, int count , int startingEnergy){
        if (!input.equals("End of battle")){
            return true;
        }
        System.out.printf("Won battles: %d. Energy left: %d", count , startingEnergy);
        return false;
    }
    public static void print(int win, int energy, int distance){
        System.out.printf("Not enough energy! Game ends with %d won battles " +
                "and %d energy",win-1,energy+distance);

    }
}
