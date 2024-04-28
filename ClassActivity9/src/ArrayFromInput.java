import java.util.Scanner;
public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] colors = new String[3];
        String[] movies = new String[3];
        int[] ages = new int[3];
        //populating
        //colors
        System.out.println("Enter three colors (press enter after each one):");
        for (int i = 0; i < colors.length; i++) {
            System.out.print("\t");
            colors[i] = scnr.nextLine();
        }
        //movies
        System.out.println("Enter three movie titles (press enter after each one):");
        for (int i = 0; i < movies.length; i++) {
            System.out.print("\t");
            movies[i] = scnr.nextLine();
        }
        //ages
        System.out.println("Enter three ages (press enter after each one):");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("\t");
            ages[i] = scnr.nextInt();
        }
        //printing
        //colors
        System.out.println("Colors");
        System.out.println("------");
        for (int i = 0; i < colors.length; ++i) {
            System.out.println(colors[i]);
        }
        System.out.println();
        //movies
        System.out.println("Movies");
        System.out.println("------");
        for (int i = 0; i < movies.length; ++i) {
            System.out.println(movies[i]);
        }
        System.out.println();
        //ages
        System.out.println("Ages");
        System.out.println("----");
        for (int i = 0; i < ages.length; ++i) {
            System.out.println(ages[i]);
        }
        System.out.println();
    }
}
