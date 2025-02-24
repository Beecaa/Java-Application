
package chapter_12.swing;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("panel name");
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JTextField textField = new JTextField(50);
        
        
        panel.add(label);
        panel.add(frame);
        panel.add(textField);
        panel.setBackground(Color.RED);
        
        
        
                
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
        frame.add(panel);
        
        
        
}
}