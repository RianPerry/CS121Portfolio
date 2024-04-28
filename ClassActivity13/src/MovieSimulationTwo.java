public class MovieSimulationTwo {
    public static void main(String[] args) {
        final int ROWS = 5;
        final int COLUMNS = 10;
        String[] names = {"Jaws", "Batman", "Beekeeper", "Hunger Games"};
        String[] types = {"3D", "2D", "2D", "2D"};
        double[] prices = {12.25, 14.75, 14.15, 17.00};
        int[][] seats = new int[ROWS][COLUMNS];
        displayMovieDetails(names,types,prices);
        setSeatAvailability(seats);
        displaySeatAvailability(seats);
        randomizeAvailability(seats);
        displaySeatAvailability(seats);
    }
    public static void setSeatAvailability(int[][] theaterSeats) {
        final int ROWS = 5;
        final int COLUMNS = 10;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                theaterSeats[i][j] = 0;
            }
        }
    }
    public static void randomizeAvailability(int[][] seats) {
        //
    }
    public static void displaySeatAvailability(int[][] seats) {
        for (int[] i : seats) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void displayMovieDetails(String[] title, String[] type, double[] price) {
        String header = String.format("\n------------------------------ Movie Details ------------------------------\n" +
                "%-20s %-20s %-20s\n", "Movie Name", "Movie Type", "Movie Price");
        System.out.print(header);
        for (int i = 0; i < 4; ++i) {
            System.out.printf("Movie %d: %-18s %-18s $%-18.2f\n",(i+1), title[i], type[i], price[i]);
        }
    }
}
