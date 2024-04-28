import ClassActivity15.Dragon;
import ClassActivity15.Dog;

public class Test {
    public static void main(String[] args) {
        Dragon harper = new Dragon("Harper","Ice","White");
        Dog martin = new Dog("Martin",8,"Yellow Lab");

        harper.displayInfo();
        System.out.println();
        martin.displayInfo();
    }
}
