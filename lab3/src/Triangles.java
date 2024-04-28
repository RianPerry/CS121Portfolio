import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int side1;
        int side2;
        int side3;
        System.out.print("Enter the length of the first side: ");
        side1 = scnr.nextInt();
        System.out.print("Enter the length of the second side: ");
        side2 = scnr.nextInt();
        System.out.print("Enter the length of the third side: ");
        side3 = scnr.nextInt();
        if (side1 == side2 && side1 == side3 && side2 == side3) {
            System.out.print("Equilateral.");
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.print("Isoceles.");
        }
        else {
            System.out.print("Scalene.");
        }
    }
}
