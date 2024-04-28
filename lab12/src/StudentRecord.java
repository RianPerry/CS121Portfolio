import java.util.HashMap;
public class StudentRecord {
    private HashMap<String,Student> studentMap = new HashMap<>();

    public StudentRecord(){}

    public void addStudent(String id,Student student) {
        studentMap.put(id,student);
    }

    public void removeStudent(String id) {
        studentMap.remove(id);
    }

    public Student getStudent(String id) {
        Student foundStudent = null;
        if (studentMap.containsKey(id)) {
            foundStudent = studentMap.get(id);
        }
        return foundStudent;
    }

    public StringBuilder getAllStudents() {
        StringBuilder students = new StringBuilder();
        studentMap.forEach((id,student) -> {
            students.append(String.format(student.toString()));
        });
        return students;
    }
}
