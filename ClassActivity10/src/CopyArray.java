import java.util.Scanner;
public class CopyArray {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter number of array elements: ");
        final int ELS = scnr.nextInt();
        int[] array1 = new int[ELS];
        int[] array2 = new int[ELS];
        int[] array3 = new int[ELS];
        int[] array4 = new int[ELS];
        for (int i = 0; i < ELS; ++i) {
            System.out.print("Enter array element " + i + ": ");
            array1[i] = scnr.nextInt();
        }
        System.out.println();
        System.out.println("Array 1");
        for (int i = 0; i < array1.length; ++i) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        //2 - copied
        for (int i = 0; i < array1.length; ++i) {
            array2[i] = array1[i];
        }
        System.out.println();
        System.out.println("Array 2 - copied");
        for (int i = 0; i < array2.length; ++i) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        //3 - squared
        for (int i = 0; i < array1.length; ++i) {
            array3[i] = array1[i] * array1[i];
        }
        System.out.println("\t");
        System.out.println("Array 3 - squared");
        for (int i = 0; i < array3.length; ++i) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        //4 - reversed
        int j = ELS - 1;
        for (int i = 0; i < array1.length; ++i) {
            array4[i] = array1[j];
            j--;
        }
        System.out.println();
        System.out.println("Array 4 - reversed");
        for (int i = 0; i < array4.length; ++i) {
            System.out.print(array4[i] + " ");
        }
        System.out.println();
    }
}
