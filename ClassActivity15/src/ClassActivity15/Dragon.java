package ClassActivity15;
public class Dragon {
    String name;
    String type;
    String color;

    public Dragon(String Name, String Type, String Color) {
        this.name = Name;
        this.type = Type;
        this.color = Color;
    }

    public void displayInfo() {
        System.out.println("The Dragon is called " + name);
        System.out.println("Their type is " + type);
        System.out.println("Their color is " + color);
    }
}
