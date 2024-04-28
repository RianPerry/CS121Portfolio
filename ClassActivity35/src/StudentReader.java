import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class StudentReader {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("students.json"));
            //Student studentInfo = gson.fromJson(reader,Student.class);
            Type studentArrayList = new TypeToken<ArrayList<Student>>(){}.getType();
            ArrayList<Student> studentList = gson.fromJson(reader,studentArrayList);

            System.out.println("********** Student Details **********");
            for (Student studentInfo: studentList) {
                System.out.printf("First Name: %s\nLast Name: %s\nYear: %s\n", studentInfo
                        .getFirstName(), studentInfo.getLastName(), studentInfo.getYear());
                System.out.println("--------------------\n\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
