import javax.swing.*;
public class BookClubPoints {
    public static void main(String[] args) {
        int purchased;
        int points;
        purchased = Integer.parseInt(JOptionPane.showInputDialog("How many books have you purchased this month?"));
        if (purchased == 0) {
            points = 0;
        }
        else if (purchased == 1) {
            points = 5;
        }
        else if (purchased == 2) {
            points = 15;
        }
        else if (purchased == 3) {
            points = 30;
        }
        else if (purchased >= 4) {
            points = 60;
        }
        else {
            points = -1;
            JOptionPane.showMessageDialog(null, "Invalid input.");
        }
        JOptionPane.showMessageDialog(null, "You earned " + points + " points.");
    }
}
