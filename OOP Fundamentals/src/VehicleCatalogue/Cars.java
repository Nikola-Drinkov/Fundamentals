package VehicleCatalogue;

public class Cars {
    private String model;
    private String color;
    private int horsepower;

    public Cars(String model, String color, int horsepower) {
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
        return String.format("Type: Car%n" +
                "Model: %s%n" +
                "Color: %s%n" +
                "Horsepower: %d",this.model,this.color,this.horsepower);
    }
}
