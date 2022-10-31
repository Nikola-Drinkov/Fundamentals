package VehicleCatalogue;

public class Trucks {
    private String model;
    private String color;
    private int horsepower;

    public Trucks(String model, String color, int horsepower) {
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }
    @Override
    public String toString() {
        return String.format("Type: Truck%n" +
                "Model: %s%n" +
                "Color: %s%n" +
                "Horsepower: %d",this.model,this.color,this.horsepower);
    }
}
