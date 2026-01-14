import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class gameWindow {

    public static void main(String[] args) {
        // create the window 
        JFrame frame = new JFrame("My 2D Game");
        frame.setSize(800, 600); // width x height 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create the drawing panel
        GamePanel panel = new GamePanel();
        frame.add(panel);

        frame.setVisible(true);
    }
 }

 // custom game panel to handle drawing 
 class GamePanel extends JPanel {
    // override paintComponent to draw graphics 
    @Override 
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // fill background 
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        // draw a red square 
        g.setColor(Color.RED);
        g.fillRect(100, 100, 50, 50);

        // draw a green circle 
        g.setColor(Color.GREEN);
        g.fillOval(200, 200, 50, 50);
    }
    
 }