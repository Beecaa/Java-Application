
package chapter_12.swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JLabelExample {

    private static Object SwingCONSTANTS;
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Label Demo");
        JLabel label = new JLabel("learning java is annoying", SwingConstants.CENTER);
        
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);
    }

    private static class SwingCONSTANTs {

        private static int CENTER;

        
        
    }
}

