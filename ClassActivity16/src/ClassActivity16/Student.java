package ClassActivity16;
public class Student {
    private String name;
    private int id;
    private int age;
    private String major;
    private double gpa;

    public Student(String name, int id, int age, String major, double gpa) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
