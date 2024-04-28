import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {
    public static void main(String[] args) {
        try {
            Student studentInfo = new Student("George", "Hendrix", "Sophomore");
            Gson gson = new Gson();
            String jsonString = gson.toJson(studentInfo);
            System.out.println(jsonString);
            FileWriter fileWrite = new FileWriter("student.json");
            fileWrite.write(jsonString);
            fileWrite.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
