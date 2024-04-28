import java.util.Scanner;
public class GCDTest {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int num1 = Integer.parseInt(scnr.nextLine());
        System.out.print("Enter Number 2: ");
        int num2 = Integer.parseInt(scnr.nextLine());

        System.out.println("1. for loop gcd: " + gcd.forGCD(num1,num2));
        System.out.println("2. while loop gcd: " + gcd.whileGCD(num1,num2));
        System.out.println("3. recursive gcd: " + gcd.recurseGCD(num1,num2));
        scnr.close();
    }
}
