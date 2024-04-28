package packagesDemo;
public class packagesTest {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Fiesta", "Blue", 2009);
        //System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());
        System.out.println();
        //car1.make = "Nissan";
        //car1.model = "Versa";
        car1.color = "Green";
        car1.year = 2007;
        //System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());
    }
}