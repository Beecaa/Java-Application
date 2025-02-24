
package chapter_12.swing;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class JTabbedPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tabbed pane");
        JTabbedPane tabbedPane = new JTabbedPane();
        JLabel label1 = new JLabel("Content 1");
        JLabel label2 = new JLabel("Content 2");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        
        panel1.add(label1);
        panel2.add(label2);
        tabbedPane.addTab("Tab 1",panel1);
        tabbedPane.addTab("Tab 2", panel2);
        
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
        frame.add(tabbedPane);
    }
}
