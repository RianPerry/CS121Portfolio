import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = scnr.nextInt();
        if ((num % 2) == 0) {
            System.out.print("The number is even.");
        }
        else {
            System.out.print("The number is odd.");
        }
    }
}
