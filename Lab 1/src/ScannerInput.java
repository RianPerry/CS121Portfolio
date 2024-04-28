import java.util.Scanner;
public class ScannerInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int l;
        int w;
        int area;
        int perim;
        System.out.println("Enter the length of the rectangle:");
        l = scnr.nextInt();
        System.out.println("Enter the width of the rectangle:");
        w = scnr.nextInt();
        area = l * w;
        perim = (l * 2) + (w * 2);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perim);
    }
}
