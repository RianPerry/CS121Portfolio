package packagesDemo;
public class Car {
    private String make;
    private String model;
    public String color;
    public int year;
    public Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }
    private String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    String getColor() {
        return color;
    }
    protected int getYear() {
        return year;
    }
}