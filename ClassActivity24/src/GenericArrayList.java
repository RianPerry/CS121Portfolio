import java.util.ArrayList;
import java.util.Arrays;
public class GenericArrayList {
    public <T>void printArrayList(ArrayList<T> arrayList) {
        System.out.println("\nPrinting List...");
        for (T type : arrayList) {
            System.out.print(type + " ");
        }
        System.out.println();
    }
}
