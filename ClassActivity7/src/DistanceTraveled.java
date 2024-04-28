import java.util.Scanner;
public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int speed;
        int hour;
        System.out.println("Enter the speed(mph): ");
        speed = scnr.nextInt();
        System.out.println("Enter the number of hours spent traveling: ");
        hour = scnr.nextInt();
        System.out.println("Hour\tDistance Traveled");
        System.out.println("-------------------------");
        for (int i = 1; i <= hour; ++i) {
            System.out.println(i + "\t\t" + (speed * i));
        }
    }
}
