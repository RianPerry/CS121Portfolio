import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        String house;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a Hogwarts house: ");
        house = scnr.nextLine();
        switch (house) {
            case "Ravenclaw":
                System.out.print("Founded by Rowena Ravenclaw\n" +
                        "Eagle\nBlue and Bronze\nIntelligence and Creativity");
                break;
            case "Hufflepuff":
                System.out.print("Founded by Helga Hufflepuff\n" +
                        "Badger\nYellow and Black\nHard work and Loyalty");
                break;
            case "Gryffindor":
                System.out.print("Founded by Godric Gryffindor\n" +
                        "Lion\nScarlet and Gold\nHonor and Bravery");
                break;
            case "Slytherin":
                System.out.print("Founded by Salazar SLytherin\n" +
                        "Snake\nGreen and Silver\nResourcefulness and Ambition");
                break;
        }
    }
}
