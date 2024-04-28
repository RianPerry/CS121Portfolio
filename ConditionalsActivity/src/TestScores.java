import javax.swing.*;
public class TestScores {
    public static void main(String[] args) {
        int score1;
        int score2;
        int score3;
        double average;
        char letterGrade;
        score1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first score:"));
        score2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second score:"));
        score3 = Integer.parseInt(JOptionPane.showInputDialog("Enter third score:"));
        average = (score1 + score2 + score3) / (double)3;
        JOptionPane.showMessageDialog(null,"The average score is " + average + "%.");
        if (average < 60) {
            letterGrade = 'F';
        }
        else if (average < 70) {
            letterGrade = 'D';
        }
        else if (average < 80) {
            letterGrade = 'C';
        }
        else if (average < 90) {
            letterGrade = 'B';
        }
        else if (average <= 100) {
            letterGrade = 'A';
        }
        else {
            letterGrade = 'F';
            JOptionPane.showMessageDialog(null,"Invalid input.");
        }
        JOptionPane.showMessageDialog(null,"Your grade is " + letterGrade + ".");
    }
}
