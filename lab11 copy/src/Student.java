import java.util.LinkedList;
public class Student {
    private String name;
    private int id;
    private LinkedList<String> courseList = new LinkedList<>();

    public void sortCourseList() {
        String temp;
        for (int i = 1; i < courseList.size(); i++) {
            for (int j = i; j > 0; j--) {
                temp = courseList.get(j);
                courseList.set(j,courseList.get(j - 1));
                courseList.set(j - 1, temp);
            }
        }
    }

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

    public StringBuilder getAllCourses() {
        StringBuilder courses = new StringBuilder();
        for (String course : courseList) {
            courses.append(course.toString());
        }
        return courses;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nId: %d\n",name,id);
    }
}
