import java.util.ArrayList;
public class StringArrayList {
    private ArrayList<String> flowers = new ArrayList<>();

    public void addFlower(String flower) {
        flowers.add(flower);
    }

    public void removeFlower(String flower) {
        flowers.remove(flower);
    }

    public int getFlowerSize() {
        return flowers.size();
    }

    public String getFlower(int index) {
        return flowers.get(index);
    }
    public void displayFlowers1() {
        System.out.printf("Flowers:\n");
        for (String flower : flowers) {
            System.out.printf("%s\n",flower);
        }
    }

    public void displayFlowers2() {
        System.out.printf("Flowers:\n");
        for (int i = 0; i < flowers.size(); i++) {
            System.out.printf("%s\n",flowers.get(i));
        }
    }
}
