import java.util.Random;
import java.util.Scanner;

public class MovieSimulationThree {
    public static void main(String[] args) {
        String [] movieNames = {"Jaws","Barbie","Beekeeper","Shrek"};
        String [] movieTypes= {"3D","2D","2D","3D"};
        double [] moviePrice = {15.25,20.15,18.75,14.15};

        final int ROWS = 5;
        final int COLUMNS = 10;

        int [][] movieAvailability = new int [ROWS][COLUMNS];

        displayMovieDetails(movieNames,movieTypes,moviePrice);
        int index = selectMovie();
        displaySelectedMovie(index,movieNames,movieTypes,moviePrice);
        setSeatAvailability(movieAvailability);
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
    }
    static void displaySelectedMovie(int i, String[] mNames, String[] mTypes, double[] mPrice) {
        String header = String.format("\n --------------------------- Movie Selection --------------------------\n" +
                "%-20s %-20s%-20s\n","Movie Selected","Movie Type","Movie Price");
        System.out.println(header);
            System.out.printf(" %-16s %-16s $%-16.2f\n",mNames[i],mTypes[i],mPrice[i]);
    }

    static int selectMovie() {
        Scanner scnr = new Scanner(System.in);
        int index = 4;
        while (index == 4) {
            System.out.print("Select a movie: ");
            String sel = scnr.nextLine();
            if (sel.equals("Jaws")) {
                index = 0;
            } else if (sel.equals("Barbie")) {
                index = 1;
            } else if (sel.equals("Beekeeper")) {
                index = 2;
            } else if (sel.equals("Shrek")) {
                index = 3;
            } else {
                System.out.print("Movie not found. Try again: ");
            }
        }
        return index;
    }

    static void randomizeAvailability(int [][] movieAvailability) {
        Random rand = new Random();
        for (int i = 0 ; i <movieAvailability.length ; i++ ) {
            for (int j = 0 ; j < movieAvailability[i].length ; j++) {
                movieAvailability[i][j] = rand.nextInt(2);
            }
        }
    }
    static void displaySeatAvailability(int [][] movieAvailability) {
        char[] rowLabel = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("\nSeating Availability: [ 1 = unavailable ; 0 = available ]\n");
        for (int c = 1; c <= movieAvailability[0].length; c++) {
            System.out.printf(" %d", c);
        }
        System.out.printf("\n%s","--".repeat(10));
        for (int i = 0 ; i <movieAvailability.length ; i++ ) {
            System.out.printf("\n%s |", rowLabel[i]);
            for (int j = 0 ; j < movieAvailability[i].length ; j++) {
                System.out.print(movieAvailability[i][j] + " " );
            }
            System.out.println();
        }
    }

    static void setSeatAvailability(int [][] movieAvailability) {
        for (int i = 0; i <movieAvailability.length ; i++ ) {
            for (int j = 0; j < movieAvailability[i].length ; j++) {
                movieAvailability[i][j] = 0;
            }
        }
    }

    static void displayMovieDetails(String [] mNames,String [] mTypes, double [] mPrice) {
        String header = String.format("\n --------------------------- Movie Showcase --------------------------\n" +
                "%-20s %-20s%-20s\n","Movie Name","Movie Type","Movie Price");
        System.out.println(header);
        for (int i = 0; i < mNames.length; i++) {
            System.out.printf("Movie %d : %-16s %-16s $%-16.2f\n",(i+1),mNames[i],mTypes[i],mPrice[i]);
        }
    }
}
