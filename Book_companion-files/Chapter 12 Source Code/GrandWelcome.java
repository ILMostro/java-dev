//GrandWelcome Applet

import java.awt.*;
import javax.swing.JApplet;

public class GrandWelcome extends JApplet
{
    public void paint(Graphics g)
    {
        super.paint(g);

        g.setColor(Color.red);
        g.setFont(new Font("Courier", Font.BOLD, 24));
        g.drawString("Welcome to Java Programming", 30, 30);
    }
}
