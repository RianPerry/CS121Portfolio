public class TwoDArrays {
    public static void main(String[] args) {
        //array1
        int[][] array1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        } ;
        System.out.println("Array 1:");
        for (int i = 0; i < array1.length; ++i){
            for (int j = 0; j < array1[i].length; ++j){
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        //array2
        double[][] array2 = new double[4][3];
        array2[0][0] = 0.1;
        array2[0][1] = 0.2;
        array2[0][2] = 0.3;
        array2[1][0] = 1.1;
        array2[1][1] = 1.2;
        array2[1][2] = 1.3;
        array2[2][0] = 2.1;
        array2[2][1] = 2.2;
        array2[2][2] = 2.3;
        array2[3][0] = 3.1;
        array2[3][1] = 3.2;
        array2[3][2] = 3.3;
        System.out.println();
        System.out.println("Array 2:");
        for (double[] array : array2) {
            for (double inner : array) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }
        //array3
        String[][] array3 = {
                {"Adam", "Mary", "John"},
                {"Dean", "Cas", "Jack"},
                {"Sam", "Jo", "Bobby"}
        };
        System.out.println();
        System.out.println("Array 3:");
        for (String[] array : array3) {
            for (String inner : array) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }
    }
}
