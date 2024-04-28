import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringArrayListTest {
    @Test
    public void test() {
        StringArrayList flowers = new StringArrayList();
        flowers.addFlower("rose");
        flowers.addFlower("lily");
        flowers.addFlower("peony");
        flowers.addFlower("lilac");

        //add
        flowers.addFlower("daffodil");

        //remove
        flowers.removeFlower("daffodil");

        //get size
        System.out.println(flowers.getFlowerSize());
        System.out.println();

        //get element
        System.out.println(flowers.getFlower(2));
        System.out.println();

        //display1
        flowers.displayFlowers1();
        System.out.println();

        //display2
        flowers.displayFlowers2();
        System.out.println();
    }
}