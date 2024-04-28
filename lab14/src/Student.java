import java.util.LinkedList;
public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private String major;
    private String classStanding;
    private double gpa;
    private LinkedList<String> courseList = new LinkedList<>();

    public void sortCourseList() {
        String temp;
        for (int i = 1; i < courseList.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (courseList.get(j).compareToIgnoreCase(courseList.get(j - 1)) < 0) {
                    temp = courseList.get(j);
                    courseList.set(j, courseList.get(j - 1));
                    courseList.set(j - 1, temp);
                }
            }
        }
    }

    public Student(String firstName, String lastName, int id, String major, String classStanding, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = gpa;
    }

    public void addCourse(String course) {
        courseList.add(course);
    }

    public void removeCourse(String course) {
        courseList.remove(course);
    }

    public String getCourse(String courseName) {
        String foundCourse = null;
        if (courseList.contains(courseName)) {
            foundCourse = courseName;
        }
        return foundCourse;
    }

    public StringBuilder getStudentCourses() {
        StringBuilder courses = new StringBuilder();
        courses.append("Courses: \n");
        for (String course : courseList) {
            courses.append(course + "\n");
        }
        return courses;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s\nID: %d\nMajor: %s\nClass Standing: %s\nGPA: %.2f\n",firstName,lastName,id,major,classStanding,gpa);
    }
}
