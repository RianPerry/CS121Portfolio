import javax.swing.*;
public class DialogInput {
    public static void main(String[] args) {
        int l;
        int w;
        int area;
        int perim;
        l = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the rectangle:"));
        w = Integer.parseInt(JOptionPane.showInputDialog("Enter the width of the rectangle:"));
        area = l * w;
        perim = (l * 2) + (w * 2);
        JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + area + "" +
                "\nThe perimeter of the rectangle is: " + perim);
    }
}
