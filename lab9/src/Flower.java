public class Flower {
    protected String name, color;
    protected int petals;
    protected double height;

    public Flower(String name, String color, int petals, double height) {
        this.name = name;
        this.color = color;
        this.petals= petals;
        this.height = height;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public void setHeight(double Height) {
        this.height = Height;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPetals() {
        return petals;
    }

    public double getHeight() {
        return height;
    }

    public void bloom() {
        System.out.println(name + " is blooming!");
    }

    public void wilt() {
        System.out.println(name + " is wilting.");
    }

    public void grow() {
        System.out.println("Initial growth");
    }

    @Override
    public String toString() {
        return String.format("The Flower: %s  Color: %s  # of petals: %d Height: %.2f",name,color,petals,height);
    }
}
