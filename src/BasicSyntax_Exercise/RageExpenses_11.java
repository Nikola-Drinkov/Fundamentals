package BasicSyntax_Exercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lostGames = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        int brokenHeadset = lostGames/2;
        int brokenMouse = lostGames/3;
        int brokenKeyboard = lostGames/6;
        int brokenDisplay = lostGames/12;

        double sum = headsetPrice*brokenHeadset+mousePrice*brokenMouse+keyboardPrice*brokenKeyboard+displayPrice*brokenDisplay;
        System.out.printf("Rage expenses: %.2f lv.",sum);

    }
}
