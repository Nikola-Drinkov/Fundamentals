package BasicSyntax_Exercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //((daysInMonth * capsulesCount) * pricePerCapsule)

        int n = Integer.parseInt(sc.nextLine());
        double total = 0;

        for(int i=1; i<=n; i++){
            double pricePerCapsule = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            int capsulesCount = Integer.parseInt(sc.nextLine());

            double price = (days*capsulesCount)*pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n",price);
            total+=price;
        }
        System.out.printf("Total: $%.2f%n",total);

    }
}
