package BasicSyntax_Exercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double availableSum = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double priceLight = Double.parseDouble(sc.nextLine());
        double priceRobe = Double.parseDouble(sc.nextLine());
        double priceBelt = Double.parseDouble(sc.nextLine());

        int freeBelts = students/6;
        double sumBelts = (students-freeBelts)*priceBelt;
        double sumLights = (students+Math.ceil(0.1*students))*priceLight;
        double sumRobes = students*priceRobe;
        double total = sumBelts+sumLights+sumRobes;


        if(availableSum>=total){
            System.out.printf("The money is enough - it would cost %.2flv.",total);
        }
        else{
            double shortage = total-availableSum;
            System.out.printf("George Lucas will need %.2flv more.",shortage);
        }
    }
}
