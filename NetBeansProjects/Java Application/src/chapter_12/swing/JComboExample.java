
package chapter_12.swing;
import javax.swing.JFrame;
import javax.swing.JComboBox;

public class JComboExample {
    public static void main(String[] args) {
        String[]countries = {"Ghana", "Nigeria","China", "United States", "Canada"};
        JFrame frame = new JFrame("Combo box demo");
        JComboBox<String> comboBox = new JComboBox<>(countries);
        
        frame.setSize(500, 0500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
        frame.add(comboBox);
    }
}
