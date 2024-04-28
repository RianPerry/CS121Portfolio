package overloaded;

public class Main {
    public static void main(String[] args) {
        Dog ralph = new Dog();
        Dog eden = new Dog("eden");
        Dog naomi = new Dog("naomi","german shepherd","black",8);
        System.out.println(naomi.getAge());
        naomi.setAge(9);
        System.out.println(naomi.getAge());
        naomi.setAge(9,10);
        System.out.println(naomi.getAge());
    }
}
