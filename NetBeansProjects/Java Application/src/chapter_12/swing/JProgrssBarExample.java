
package chapter_12.swing;
import javax.swing.JProgressBar;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JProgrssBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Progress Bae");
        JProgressBar progressBar = new JProgressBar();
        
        progressBar.setValue(40);
        progressBar.setStringPainted(true);
        
        frame.setSize(500, 70);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
        frame.add(progressBar);
    }
}
