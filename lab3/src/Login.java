import javax.swing.*;
public class Login {
    public static void main(String[] args) {
        String userName = "username";
        String password = "password";
        String name;
        String pw;
        name = JOptionPane.showInputDialog("Enter username:");
        pw = JOptionPane.showInputDialog("Enter password:");
        if (name.equals(userName) && pw.equals(password)) {
            JOptionPane.showMessageDialog(null,"Welcome to CS121.");
        }
        else if (name.equals(userName) && !pw.equals(password)) {
            JOptionPane.showMessageDialog(null,"Incorrect password.");
        }
        else if (!name.equals(userName) && pw.equals(password)) {
            JOptionPane.showMessageDialog(null,"Incorrect username.");
        }
        else {
            JOptionPane.showMessageDialog(null,"Incorrect username and password.");
        }
    }
}
