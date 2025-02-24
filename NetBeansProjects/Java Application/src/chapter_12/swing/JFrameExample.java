
package chapter_12.swing;
import javax.swing.JFrame;


public class JFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame");
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setVisible(true);
       
    }
}
