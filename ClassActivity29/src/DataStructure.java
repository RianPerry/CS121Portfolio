import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[3];
    private HashMap<String,Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();

    //add
    public void addStudent(String name) {
        studentList.add(name);
    }
    public void addAge(int index, int age) {
        ageList[index] = age;
    }
    public void addMajorGpa(String major, Double gpa) {
        majorGpaMap.put(major,gpa);
    }
    public void addNationality(String nationality) {
        nationalityList.add(nationality);
    }
    public void addHometown(String hometown) {
        hometownStack.push(hometown);
    }
    public void addState(String state) {
        homeStateQueue.add(state);
    }

    //remove
    public void removeStudent(String name) {
        studentList.remove(name);
    }
    public void removeAge(int index, int age) {
        //
    }
    public void removeMajorGpa(String major) {
        majorGpaMap.remove(major);
    }
    public void removeNationality(int index) {
        nationalityList.remove(index);
    }
    public void removeHometown() {
        hometownStack.pop();
    }
    public void removeState() {
        homeStateQueue.remove();
    }

    //print
    public void printStudent() {
        for (String student : studentList) {
            System.out.printf("Student: %s\n",student);
        }
    }
    public void printAge() {
        for (int age : ageList) {
            System.out.printf("Age: %d\n",age);
        }
    }
    public void printMajorGpa() {
        majorGpaMap.forEach((major,gpa) -> {
            System.out.printf("Major: %s | Gpa: %f\n",major,gpa);
        });
    }
    public void printNationality() {
        System.out.printf("Nationalities: %s\n",nationalityList);
    }
    public void printHometown() {
        System.out.println(hometownStack + "\n");
    }
    public void printState() {
        System.out.println(homeStateQueue + "\n");
    }
}
