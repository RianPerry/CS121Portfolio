public class Orchid extends Flower {
    private String orchidType;
    public Orchid(String name, String color, int petals, double height, String orchidType) {
        super(name,color,petals,height);
        this.orchidType = orchidType;
    }
    @Override
    public String toString() {
        return ("The orchid type: " + orchidType);
    }
}
