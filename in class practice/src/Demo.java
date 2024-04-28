import javax.swing.*;
import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {
        //declare scanner object
        Scanner scanner = new Scanner(System.in);
        //declare variable
        String name, favColor;
        double gpa;
        char letterGrade;
        boolean csMajor;

        //name = scanner.nextLine();
        //gpa = Double.parseDouble(scanner.nextLine());

        //JOption user interface
        name = JOptionPane.showInputDialog(null, "Enter your name");
        gpa = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your GPA"));
        JOptionPane.showMessageDialog(null, "This is your name: " + name);
        JOptionPane.showMessageDialog(null, "This is your GPA: " + gpa);

        //System.out.print("This is the gpa: " + gpa);
    }
}
