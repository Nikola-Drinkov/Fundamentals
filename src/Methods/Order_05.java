package Methods;

import java.util.Scanner;

public class Order_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.printf("%.2f",makePrice(product,quantity));
    }
    public static double makePrice(String product, int quantity){
        double price = 0;
        switch (product){
            case"coffee":
                price = 1.50;
                break;
            case"water":
                price = 1.00;
                break;
            case"coke":
                price = 1.40;
                break;
            case"snacks":
                price = 2.00;
                break;
        }
        return price*quantity;
    }
}
