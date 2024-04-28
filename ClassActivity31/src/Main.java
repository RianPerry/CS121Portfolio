import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] arrayToSort = sorting.getArray();
        System.out.println("Unsorted Array: " + Arrays.toString(arrayToSort));
        int[] sortedArray = sorting.sortArray(arrayToSort);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
