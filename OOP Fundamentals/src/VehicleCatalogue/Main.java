package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countTrucks = 0;
        int countCars = 0;
        int totalCarsHp = 0;
        int totalTruckHp = 0;
        List<Trucks> trucksList = new ArrayList<>();
        List<Cars> carsList = new ArrayList<>();
        String input = sc.nextLine();
        while(!input.equals("End")){
            String [] data = input.split(" ");
            if(data[0].equals("car")){
                Cars car = new Cars(data[1],data[2],Integer.parseInt(data[3]));
                countCars++;
                totalCarsHp+=Integer.parseInt(data[3]);
                carsList.add(car);
            }
            else if(data[0].equals("truck")){
                Trucks truck = new Trucks(data[1],data[2],Integer.parseInt(data[3]));
                countTrucks++;
                totalTruckHp+=Integer.parseInt(data[3]);
                trucksList.add(truck);
            }
            input = sc.nextLine();
        }
        String secondInp = sc.nextLine();
        while(!secondInp.equals("Close the Catalogue")){
            for(Cars car:carsList){
                if(car.getModel().equals(secondInp)){
                    System.out.println(car);
                    }
                }
            for(Trucks truck:trucksList){
                if (truck.getModel().equals(secondInp)){
                    System.out.println(truck);
                }
            }
            secondInp= sc.nextLine();
        }
        double averageCarHp = (double)totalCarsHp/countCars;
        double averageTrucksHp = (double)totalTruckHp/countTrucks;
        if(countCars==0){
            averageCarHp=0;
        }
        if(countTrucks==0){
            averageTrucksHp=0;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n",averageCarHp);
        System.out.printf("Trucks have average horsepower of: %.2f.%n",averageTrucksHp);

    }
}
