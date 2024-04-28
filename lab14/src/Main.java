public class Main {
    public static void main(String[] args) {
        Student student = new Student("Margaret","Harper",346287,"Elementary Education","Junior",3.94);
        student.addCourse("ENG 203");
        student.addCourse("MATH 490");
        student.addCourse("CHEM 421");

        System.out.println("Print Student Info: ");
        System.out.println(student.toString());
        System.out.println();

        System.out.println("Print unsorted Courses: ");
        System.out.println(student.getStudentCourses());
        System.out.println();

        student.sortCourseList();
        System.out.println("Print Sorted Courses: ");
        System.out.println(student.getStudentCourses());
        System.out.println();

        student.removeCourse("CHEM 421");
        System.out.println("Print After Removal: ");
        System.out.println(student.getStudentCourses());
        System.out.println();
    }
}
