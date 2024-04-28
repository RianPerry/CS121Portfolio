package overloaded;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    public Dog() {
    }
    public Dog(String name) {
        this.name = name;
    }
    public Dog(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String getColor() {
        return color;
    }
    public int getAge() {
        return age;
    }
    public void setName() {
        this.name = name;
    }
    public void setBreed() {
        this.breed = breed;
    }
    public void setColor() {
        this.color = color;
    }
    public void setAge() {
        this.age = age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAge(int age, int newAge) {
        this.age = newAge;
    }
}
