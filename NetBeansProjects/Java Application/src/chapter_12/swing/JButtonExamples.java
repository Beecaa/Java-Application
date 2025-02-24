
package chapter_12.swing;
import javax.swing.JFrame;
import javax.swing.JButton;

public class JButtonExamples {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Button Demo");
     JButton button = new JButton("Click me");
     
   frame.setSize(500,500);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
     frame.add(button);
    }
     

}
