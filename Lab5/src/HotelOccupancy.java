import java.util.Scanner;
public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int floors;
        int totRooms = 0;
        int occRooms = 0;
        double occRate;
        System.out.println("Enter the number of floors:");
        floors = scnr.nextInt();
        System.out.println();
        for (int i = 1; i <= floors; ++i) {
            System.out.println("Enter the number of rooms on floor " + i + ":");
            totRooms = totRooms + scnr.nextInt();
            System.out.println("Enter the number of occupied rooms on floor " + i + ":");
            occRooms = occRooms + scnr.nextInt();
            System.out.println();
        }
        occRate = (double)occRooms / totRooms;
        System.out.println("Floors: " + floors);
        System.out.println("Rooms: " + totRooms);
        System.out.println("Occupied Rooms " + occRooms);
        System.out.println("Vacant Rooms: " + (totRooms - occRooms));
        System.out.println("Occupancy: " + occRate + " (" + (occRate * 100) + "%)");
    }
}
