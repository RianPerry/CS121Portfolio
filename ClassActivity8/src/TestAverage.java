import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        int sNum;
        int sPerS;
        int avg;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number of students:");
        sNum = scnr.nextInt();
        System.out.println("Enter the number of tests per student:");
        sPerS = scnr.nextInt();
        for (int i = 1; i <= sNum; ++i) {
            System.out.println(" ");
            System.out.println("Student " + i);
            System.out.println("-------------");
            int score;
            int scores = 0;
            for (int j = 1; j <= sPerS; ++j) {
                System.out.print("Enter score " + j + ": ");
                score = scnr.nextInt();
                scores = scores + score;
            }
            System.out.println("The average for student " + i + " is " + ((double)scores/sPerS));
        }
    }
}
