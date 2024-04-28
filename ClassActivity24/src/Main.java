import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericArrayList gen = new GenericArrayList();

        ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(1.2,2.3,3.4,4.5,5.6,6.7));
        ArrayList<Character> charArrayList = new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G'));
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("red","green","blue","purple"));

        gen.printArrayList(intArrayList);
        gen.printArrayList(doubleArrayList);
        gen.printArrayList(charArrayList);
        gen.printArrayList(stringArrayList);
    }
}
