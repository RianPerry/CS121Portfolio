import java.util.ArrayList;
public class Student {
    private String name;
    private int id;
    private ArrayList<Course> courseArrayList = new ArrayList<>();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public void addCourse(Course course) {
        courseArrayList.add(course);
    }

    public void removeCourse(Course course) {
        courseArrayList.remove(course);
    }

    public Course getCourse(String courseName) {
        Course foundCourse = null;
        for (Course course : courseArrayList) {
            if (course.getCourseName().equals(courseName)) {
                foundCourse = course;
            }
        }
        return foundCourse;
    }

    public StringBuilder getAllCourses() {
        StringBuilder courses = new StringBuilder();
        for (Course course : courseArrayList) {
            courses.append(course.toString());
        }
        return courses;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nId: %d\n",name,id);
    }
}
