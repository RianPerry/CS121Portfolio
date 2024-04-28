import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.*;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("file3.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String name;
        String color;
        String meaning;

        output.printf("%-10s %-10s %-10s","Flower","Color","Meaning");
        for (int i = 1;i <= 2;i++) {
            name = JOptionPane.showInputDialog(String.format("Enter name of flower %d",i));
            color = JOptionPane.showInputDialog("Enter the color");
            meaning = JOptionPane.showInputDialog("Enter meaning");
            output.printf("%n%-10s %-10s %-10s",name,color,meaning);
        }
        output.close();
    }
}