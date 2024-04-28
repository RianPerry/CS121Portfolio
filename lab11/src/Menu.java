import java.util.ArrayList;
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
                break;
            }
        }
    }

    private void addStudent() {
        System.out.println("Enter student name:");
        String name = scnr.nextLine();
        System.out.println("Enter student ID:");
        int id = Integer.parseInt(scnr.nextLine());
        Student student = new Student(name,id);
        record.addStudent(student);

        while (true) {
            System.out.println("Enter course name (or q if finished)");
            String cName = scnr.nextLine();
            if (cName.equals("q")) {
                break;
            }
            System.out.println("Enter course credit hours:");
            int cHours = Integer.parseInt(scnr.nextLine());
            Course course = new Course(cName,cHours);
            student.addCourse(course);
        }
        System.out.println("Student has been added to the student record.");
    }

    private void removeStudent() {
        System.out.println("Enter name of student to remove:");
        String remove = scnr.nextLine();
        if (record.getStudent(remove) == null) {
            System.out.println("Student not found");
        }
        else {
            record.removeStudent(record.getStudent(remove));
        }
    }

    private void displayStudent() {
        System.out.println("Enter the name of the student to display:");
        String display = scnr.nextLine();
        if (record.getStudent(display) == null) {
            System.out.println("Student not found.");
        }
        else {
            System.out.println(record.getStudent(display));
        }
    }

    private void displayAllStudents() {
        System.out.println(record.getAllStudents());
    }
}
