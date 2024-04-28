public class Course {
    private String courseName;
    private int courseCredit;

    public Course(String courseName, int courseCredit) {
        this.courseName = courseName;
        this.courseCredit = courseCredit;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCredit() {
        return courseCredit;
    }
    @Override
    public String toString() {
        return String.format("Course: %s\nCredit Hours: %d\n",courseName,courseCredit);
    }
}
