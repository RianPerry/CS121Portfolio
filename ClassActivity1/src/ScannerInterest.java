import java.util.Scanner;
public class ScannerInterest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double A;
        int P;
        int r;
        int n;
        int t;
        System.out.print("What is the original principle?");
        P = scnr.nextInt();
        System.out.print("What is the annual interest rate?");
        r = scnr.nextInt();
        System.out.print("How many times per year is the interest compounded?");
        n = scnr.nextInt();
        System.out.print("For how many years will interest be compounded?");
        t = scnr.nextInt();

        A = P * (Math.pow(1 + ((double)r / 100) / n, n * t));
        System.out.printf("After " + t + " years you will have $" + A + ".");
    }
}
