import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWrite = new FileWriter("file.txt",true);
            PrintWriter output = new PrintWriter(fileWrite);

            String name = JOptionPane.showInputDialog("Enter flower name");
            String color = JOptionPane.showInputDialog("Enter flower color");
            String meaning = JOptionPane.showInputDialog("Enter flower meaning");

            output.printf("%-10s %-10s %-10s",name,color,meaning);
            fileWrite.close();
            output.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("*** File not found. ***");
        }
    }
}