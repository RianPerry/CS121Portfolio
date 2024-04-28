import ClassActivity16.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student adrian = new Student("Adrian", 123946, 19, "Pending", 0.0);
        System.out.println(adrian.getName());
        System.out.println(adrian.getId());
        System.out.println(adrian.getAge());
        System.out.println(adrian.getMajor());
        System.out.println(adrian.getGpa());
        System.out.println();
        adrian.setName("Adrian P.");
        System.out.println(adrian.getName());
        adrian.setId(596584);
        System.out.println(adrian.getId());
        adrian.setAge(20);
        System.out.println(adrian.getAge());
        adrian.setMajor("CS");
        System.out.println(adrian.getMajor());
        adrian.setGpa(3.8);
        System.out.println(adrian.getGpa());
    }
}
