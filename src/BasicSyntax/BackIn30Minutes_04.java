package BasicSyntax;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        int totalMinutes = hours*60+minutes+30;
        int newHour = totalMinutes/60;
        if(newHour==24){
            newHour=0;
        }
        int newMinutes = totalMinutes%60;

        System.out.printf("%d:%02d",newHour,newMinutes);
    }
}
