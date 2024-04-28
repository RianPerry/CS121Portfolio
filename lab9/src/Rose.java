public class Rose extends Flower {
    private String meaning;
    public Rose(String name, String color, int petals, double height, String meaning) {
        super(name,color,petals,height);
        this.meaning = meaning;
    }
    @Override
    public String toString() {
        return ("The flower represents: " + meaning);
    }
}
