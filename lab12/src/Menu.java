import java.util.Scanner;
public class Menu {
    private Scanner scnr = new Scanner(System.in);
    private StudentRecord record = new StudentRecord();

    public Menu(){}

    public void displayMenu() {
        while (true) {
            System.out.println("******** MENU ********\nPlease make a selection:\n" +
                    "1) Add a student\n2) Remove a student\n3) Display Student Info\n" +
                    "4) Display all Students\n5) Exit");
            String select = scnr.nextLine();
            if (select.equals("1")) {
                addStudent();
            }
            else if (select.equals("2")) {
                removeStudent();
            }
            else if (select.equals("3")) {
                displayStudent();
            }
            else if (select.equals("4")) {
                displayAllStudents();
            }
            else {
                System.out.println("Exiting...");
                break;
            }
        }
    }

    private void addStudent() {
        System.out.println("Enter student name:");
        String name = scnr.nextLine();
        System.out.println("Enter student ID:");
        String id = scnr.nextLine();
        Student student = new Student(name,id);
        record.addStudent(id,student);

        while (true) {
            System.out.println("Enter course name (or q if finished)");
            String cName = scnr.nextLine();
            if (cName.equals("q")) {
                break;
            }
            System.out.println("Enter course credit hours:");
            int cHours = Integer.parseInt(scnr.nextLine());
            Course course = new Course(cName,cHours);
            student.addCourse(cName,course);
        }
        System.out.println("Student has been added to the student record.");
    }

    private void removeStudent() {
        System.out.println("Enter ID of student to remove:");
        String id = scnr.nextLine();
        Student student = record.getStudent(id);
        if (record.getStudent(id) == null) {
            System.out.println("Student not found");
        }
        else {
            record.removeStudent(id);
            System.out.printf("%s removed from record\n",id);
        }
    }

    private void displayStudent() {
        System.out.println("Enter the ID of the student to display:");
        String id = scnr.nextLine();
        Student student = record.getStudent(id);
        if (record.getStudent(id) == null) {
            System.out.println("Student not found.");
        }
        else {
            System.out.println(student);
        }
    }

    private void displayAllStudents() {
        System.out.println(record.getAllStudents());
    }
}
