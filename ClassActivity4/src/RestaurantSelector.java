import java.util.Scanner;
public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String veg;
        String V;
        String gF;
        System.out.print("Is anyone in your party vegetarian? ");
        veg = scnr.nextLine();
        System.out.print("Is anyone in your party vegan? ");
        V = scnr.nextLine();
        System.out.print("Is anyone in your party gluten-free? ");
        gF = scnr.nextLine();
        if (V.equals("yes") && gF.equals("yes")) {
            System.out.print("Here are your restaurant choices:" +
                    "\n\tCorner Café" +
                    "\n\tThe Chef's Kitchen");
        }
        else if (V.equals("yes")) {
            System.out.print("Here are your restaurant choices:" +
                    "\n\tCorner Café" +
                    "\n\tThe Chef's Kitchen");
        }
        else if (gF.equals("yes")) {
            System.out.print("Here are your restaurant choices:" +
                    "\n\tMain Street Pizza Company \n\tCorner Café" +
                    "\n\tThe Chef's Kitchen");
        }
        else if (veg.equals("yes")) {
            System.out.print("Here are your restaurant choices:" +
                    "\n\tMain Street Pizza Company \n\tCorner Café" +
                    "\n\tMama's Fine Italian\n\tThe Chef's Kitchen");
        }
        else {
            System.out.print("Here are your restaurant choices:\n\tJoe's Gourmet Burgers" +
                    "\n\tMain Street Pizza Company \n\tCorner Café" +
                    "\n\tMama's Fine Italian\n\tThe Chef's Kitchen");
        }
    }
}
