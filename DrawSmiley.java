// Drawing a smiley face using colors and filled shapes.

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color; // imports color


public class DrawSmiley extends JPanel{
 public void paintComponent(Graphics g)
 {
 super.paintComponent(g);

 // draw the face

//Drawing a smiley face using colors and filled shapes. (Part 1 of 2.)
//Drawing a smiley face using colors and filled shapes. (Part 1 of 2.)
g.setColor(Color.YELLOW);
g.fillOval(10, 10, 200, 200);

// draw the eyes
 // draw the mouth
 // "touch up" the mouth into a smile
 }
 import javax.swing.Jframe;
 public static void main(String[] args)
 {
 DrawSmiley panel = new DrawSmiley();
 JFrame application = new JFrame();

 application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 application.add(panel);
 application.setSize(230, 250);
 application.setVisible(true);
 }
 } // end class DrawSmiley
