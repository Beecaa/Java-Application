import java.awt.*;
import javax.swing.*;

public class FlowerDrawing extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Flower center (yellow circle)
        g.setColor(Color.YELLOW);
        g.fillOval(150, 150, 100, 100);

        // Petals (red ovals)
        g.setColor(Color.RED);
        drawPetal(g, 200, 100); // Top petal
        drawPetal(g, 250, 150); // Right petal
        drawPetal(g, 200, 200); // Bottom petal
        drawPetal(g, 150, 150); // Left petal

        // Stem (green line)
        g.setColor(Color.GREEN);
        g.drawLine(200, 250, 200, 350);

        // Two leaves (green arcs)
        g.setColor(Color.GREEN);
        g.fillArc(170, 300, 30, 20, 30, 60); // Left leaf
        g.fillArc(200, 300, 30, 20, 180, 60); // Right leaf
    }

    // Helper method to draw a petal
    private void drawPetal(Graphics g, int x, int y) {
        g.fillOval(x, y, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flower");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new FlowerDrawing());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}