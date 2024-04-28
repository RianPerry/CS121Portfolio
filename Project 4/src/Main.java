import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter you name to use the application: ");
        System.out.println();
        String userName = scan.nextLine();
        double accBal = 0.0;
        AccountUser currentUser = new AccountUser(accBal, userName);
        Menu menu = new Menu();
        menu.displayMenu();
        System.out.println("User " + userName + " has completed the use of this application.") ;
    }
}