import javax.swing.*;

public class welcome {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Andrew Purcell");
        JOptionPane.showMessageDialog(null, "welcome to year 2" + name);
    }
}
