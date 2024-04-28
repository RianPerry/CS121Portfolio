import javax.swing.*;
public class WordGame {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        String city = JOptionPane.showInputDialog("Where do you live?");
        String uni = JOptionPane.showInputDialog("Where do you go to college?");
        String major = JOptionPane.showInputDialog("What is your major?");
        String ani = JOptionPane.showInputDialog("What kind of animal do you like?");
        String pet = JOptionPane.showInputDialog("What would you name them?");
        JOptionPane.showMessageDialog(null, "There was once a person named " + name
                + " who lived in " + city + ".\nAt the age of " + age + ", " + name + " went to college at "
                + uni + ".\n" + name + " graduated with a major in " + major + ".\nThen, " + name +
                " adopted a(n) " + ani + " named " + pet + ".\nThey both lived happily ever after!");
    }
}
