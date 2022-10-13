package MidExamPrevPrep;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double foodKg = Double.parseDouble(sc.nextLine());
        double hayKg = Double.parseDouble(sc.nextLine());
        double coverKg = Double.parseDouble(sc.nextLine());
        double weightKg = Double.parseDouble(sc.nextLine());

        double foodGr = foodKg*1000;
        double hayGr = hayKg*1000;
        double coverGr = coverKg*1000;
        double weightGr = weightKg*1000;

        boolean outOfFood = false;
        boolean outOfHay = false;
        boolean outOfCover = false;

        for(int i=1; i<=30;i++){
            foodGr-=300;
            if(i%2==0){
                hayGr -= 0.05*foodGr;
            }
            if(i%3==0){
                coverGr-=weightGr/3;
            }
            if(foodGr<=0){
                outOfFood=true;
                break;
            }
            if(hayGr<=0){
                outOfHay=true;
                break;
            }
            if(coverGr<=0){
                outOfCover=true;
                break;
            }
        }
        if(outOfFood||outOfCover||outOfHay){
            System.out.println("Merry must go to the pet store!");
        }
        else{
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodGr/1000,hayGr/1000,coverGr/1000);
        }
    }
}
