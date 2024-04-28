import java.util.ArrayList;
public class StudentRecord {
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public StudentRecord(){}

    public void addStudent(Student student) {
        studentArrayList.add(student);
    }

    public void removeStudent(Student student) {
        studentArrayList.remove(student);
    }

    public Student getStudent(String studentName) {
        Student foundStudent = null;
        for (Student student : studentArrayList) {
            if (student.getName().equals(studentName)) {
                foundStudent = student;
            }
        }
        return foundStudent;
    }

    public StringBuilder getAllStudents() {
        StringBuilder students = new StringBuilder();
        for (Student student : studentArrayList) {
            students.append(student.toString());
        }
        return students;
    }
}
