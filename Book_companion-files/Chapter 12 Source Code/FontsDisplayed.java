//FontsDisplayed Applet

import java.awt.*;
import javax.swing.JApplet;

public class FontsDisplayed extends JApplet
{
    public void paint(Graphics g)
    {
        super.paint(g);

        g.setFont(new Font("Courier", Font.BOLD, 24));
        g.drawString("Courier bold 24pt font", 30, 36);

        g.setFont(new Font("Arial", Font.PLAIN, 30));
        g.drawString("Arial plain 30pt font", 30, 70);

        g.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC,
                            36));
        g.drawString("Dialog italic bold 36pt font", 30, 110);

        g.setFont(new Font("Serif", Font.ITALIC, 30));
        g.drawString("Serif italic 42pt font", 30, 156);
    }
}
