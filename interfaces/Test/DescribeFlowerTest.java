import static org.junit.jupiter.api.Assertions.*;

class DescribeFlowerTest {

    @org.junit.jupiter.api.Test
    void details() {
        Rose rose = new Rose("rose","red","romantic love");
        System.out.println(rose.details());

        Tulip tulip = new Tulip("tulip","yellow",6);
        System.out.println(tulip.details());
    }
}