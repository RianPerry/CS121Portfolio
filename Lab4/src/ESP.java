import java.util.Random;
import java.util.Scanner;
public class ESP {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);
        String color;
        String input;
        int computer;
        int counter = 0;
        for (int i = 1; i < 11; ++i) {
            System.out.println(i + ". What color has the computer chosen?");
            input = scnr.nextLine();
            computer = rand.nextInt(5);
            if (computer == 0) {
                color = "red";
            }
            else if (computer == 1) {
                color = "green";
            }
            else if (computer == 2) {
                color = "blue";
            }
            else if (computer == 3) {
                color = "orange";
            }
            else {
                color = "yellow";
            }
            if (color.equals(input)) {
                counter = counter + 1;
            }
            else {

            }
            System.out.println("> The computer chose " + color);
        }
        System.out.print("You got " + counter + " out of 10 correct.");
    }
}
