import java.util.Scanner;
public class Sorting {
    public int[] getArray() {
        Scanner scnr = new Scanner(System.in);
        int[] unsorted = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter first number: ");
            int num = Integer.parseInt(scnr.nextLine());
            unsorted[i] = num;
        }
        return unsorted;
    }
    public int[] sortArray(int[] sorted) {
        int temp;
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i; j > 0; j--) {
                if (sorted[j] < sorted[j - 1]) {
                    temp = sorted[j];
                    sorted[j] = sorted[j - 1];
                    sorted[j - 1] = temp;
                }
            }
        }
        return sorted;
    }
}
