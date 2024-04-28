public class Student {
    private String firstName,lastName,year;

    Student(){}

    Student(String firstName, String lastName, String year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getYear() {
        return year;
    }
}
