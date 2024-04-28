import java.util.HashMap;

public class Student {
    private String name;
    private String id;
    private HashMap<String,Course> courseMap = new HashMap<>();

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    public void addCourse(String courseName,Course course) {
        courseMap.put(courseName,course);
    }

    public void removeCourse(String courseName) {
        courseMap.remove(courseName);
    }

    public Course getCourse(String courseName) {
        Course foundCourse = null;
        if (courseMap.containsKey(courseName)) {
            foundCourse = courseMap.get(courseName);
        }
        return foundCourse;
    }

    public StringBuilder getAllCourses() {
        StringBuilder courses = new StringBuilder();
        courseMap.forEach((courseName,course) -> {
            courses.append(course.toString());
        });
        return courses;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nId: %s\n",name,id);
    }
}
