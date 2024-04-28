public class Tulip extends Flower {
    private String name, color;
    private int petals;
    Tulip(String name, String color, int petals){
        this.name = name;
        this.color = color;
        this.petals = petals;
    }
    @Override
    public String details() {
        return String.format("The flower is a %s\nIts color is %s\nIt has %d petals",name,color,petals);
    }
}
