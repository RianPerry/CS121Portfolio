package ClassActivity15;
public class Dog {
    String name;
    int age;
    String breed;

    public Dog(String Name, int Age, String Breed) {
        this.name = Name;
        this.age = Age;
        this.breed = Breed;
    }

    public void displayInfo() {
        System.out.println("The Dog is called " + name);
        System.out.println("Their age is " + age);
        System.out.println("Their breed is " + breed);
    }
}
