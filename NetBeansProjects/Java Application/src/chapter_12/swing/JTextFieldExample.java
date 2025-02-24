
package chapter_12.swing;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text field name");
        JTextField textField = new JTextField(50);
        
        frame.setSize(500, 0500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
        frame.add(textField);
    }
}
