package BasicSyntax_Exercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int input = num;
        int sum = 0;

        while(num>0){
            int currentNum = num%10;
            int currentFact=1;

            for(int i=1; i<=currentNum; i++){
                currentFact=currentFact*i;
            }
            sum+=currentFact;
            num=num/10;
        }
        if(sum==input){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
