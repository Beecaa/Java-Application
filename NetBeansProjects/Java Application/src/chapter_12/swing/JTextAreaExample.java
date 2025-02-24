
package chapter_12.swing;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class JTextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Area demo");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Message");
        JTextArea textArea = new JTextArea(5,20);
        JScrollPane scrollBar = new JScrollPane(textArea);
        
        panel.setBackground(Color.red);
        panel.add(label);
        panel.add(scrollBar);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.add(panel);
    }
}
