import java.util.Random;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);
        final int SIZE = rand.nextInt(3,11);
        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];
        System.out.println("Enter your " + SIZE + " test scores:");
        for (int i = 0; i < testScores.length; i++) {
            System.out.print("Enter score " + (i+1) + ": ");
            testScores[i] = scnr.nextInt();
        }
        for (int j = 0; j < testScores.length; j++) {
            char letterGrade = getLetterGrade(testScores[j]);
            letterGrades[j] = letterGrade;
        }
        System.out.println();
        printGrades(testScores,letterGrades);
        System.out.println();
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);
        scnr.close();
    }
    public static char getLetterGrade(int testScore) {
        char letterGrade;
        if (testScore >= 90) {
            letterGrade = 'A';
        }
        else if (testScore >= 80) {
            letterGrade = 'B';
        }
        else if (testScore >= 70) {
            letterGrade = 'C';
        }
        else if (testScore >= 60) {
            letterGrade = 'D';
        }
        else {
            letterGrade = 'F';
        }
        return letterGrade;
    }
    public static void printGrades(int[] testScores, char[] letterGrades) {
        System.out.printf("%10s %10s\n","Score","Grade");
        for (int i = 0; i < testScores.length; i++) {
            System.out.printf("%10d %10c %n", testScores[i], letterGrades[i]);
        }
    }
    public static void printHighestScore(int[] testScores){
        int fin = 0;
        for (int score: testScores) {
            if (score > fin) {
                fin = score;
            }
        }
        System.out.println("The highest score is: " + fin);
    }
    public static void printLowestScore(int[] testScores) {
        int fin = 100;
        for (int score: testScores) {
            if (score < fin) {
                fin = score;
            }
        }
        System.out.println("The lowest score is: " + fin);
    }
    public static void printAverageScore(int[] testScores) {
        int num = 0;
        for (int score: testScores) {
            num = num + score;
        }
        double avg = (double) num / testScores.length;
        System.out.println("The average score is: " + avg);
    }
}
