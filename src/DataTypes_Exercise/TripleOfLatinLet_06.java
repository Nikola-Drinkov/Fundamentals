package DataTypes_Exercise;

import java.util.Scanner;

public class TripleOfLatinLet_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        n = n+96;

        for(char i='a'; i<=n; i++){
            for (char j='a'; j<=n; j++){
                for (char k='a'; k<=n; k++){
                    System.out.printf("%c%c%c%n",i,j,k);
                }
            }
        }
    }
}
