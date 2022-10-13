package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfNumbers_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<String> productsList = new ArrayList<>(n);
        for(int i=0; i<n;i++){
            productsList.add(sc.nextLine());
        }
        Collections.sort(productsList);
        for(int i=0; i< productsList.size();i++){
            System.out.println(i+1+"."+productsList.get(i));
        }
    }
}
