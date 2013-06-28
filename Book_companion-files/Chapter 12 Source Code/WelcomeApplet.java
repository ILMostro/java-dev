//Welcome Applet

import java.awt.Graphics;
import javax.swing.JApplet;

public class WelcomeApplet extends JApplet
{
    public void paint(Graphics g)
    {
        super.paint(g);                              //Line 1

        g.drawString("Welcome to Java Programming",
                      30, 30);                       //Line 2
    }
}
