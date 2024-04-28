import java.util.Scanner;
public class Rectangle {
    static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args) {
        double l = 0;
        double w = 0;
        double area = 0;
        l = getLength();
        w = getWidth();
        area = getArea(l,w);
        displayData(l,w,area);
        scnr.close();
    }
    public static double getLength() {
        System.out.print("Enter the length of a rectangle: ");
        double l = Double.parseDouble(scnr.nextLine());
        return l;
    }
    public static double getWidth() {
        System.out.print("Enter the width of a rectangle: ");
        double w = Double.parseDouble(scnr.nextLine());
        return w;
    }
    public static double getArea(double l, double w) {
        double area = l*w;
        return area;
    }
    public static void displayData(double l, double w, double area) {
        System.out.println("rectangle length: " + l);
        System.out.println("rectangle width: " + w);
        System.out.println("rectangle area: " + area);
    }
}
