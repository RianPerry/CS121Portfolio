import java.util.Scanner;
public class MovieSimulationOne {
    public static void printArrays(int num, String[] title, String[] type, int[] seats, double[] price) {
        String header = String.format("\n------------------------------ Movie Details ------------------------------\n" +
                "%-20s %-20s %-20s %-20s\n", "Movie Name", "Movie Type", "Available Seats", "Movie Price");
        System.out.print(header);
        for (int i = 0; i < num; ++i) {
            System.out.printf("Movie %d: %-18s %-18s %-18d %-18.2f\n",(i+1), title[i], type[i], seats[i], price[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many movies' details will you enter?");
        int dets = Integer.parseInt(scnr.nextLine());
        System.out.println();
        String[] names = new String[dets];
        String[] types = new String[dets];
        int[] seats = new int[dets];
        double[] price = new double[dets];
        for (int i = 0; i < dets; ++i) {
            System.out.println("Movie " + (i + 1));
            System.out.print("Enter name: ");
            names[i] = scnr.nextLine();
            System.out.print("Enter type: ");
            types[i] = scnr.nextLine();
            System.out.print("Enter available seats: ");
            seats[i] = Integer.parseInt(scnr.nextLine());
            System.out.print("Enter price: ");
            price[i] = Double.parseDouble(scnr.nextLine());
            System.out.println();
        }
        printArrays(dets, names, types, seats, price);
    }
}
