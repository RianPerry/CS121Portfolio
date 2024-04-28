import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file3.txt");

        try {
            Scanner scnr = new Scanner(file);
            String header = scnr.nextLine();;
            System.out.println(header);
            while (scnr.hasNextLine())
            {
                String name = scnr.next();
                String color = scnr.next();
                String meaning = scnr.next();
                System.out.printf("%n%-10s %-10s %-10s",name,color,meaning);
            }
            scnr.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}