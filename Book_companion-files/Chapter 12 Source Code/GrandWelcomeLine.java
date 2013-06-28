
//GrandWelcomeLine Applet

import java.awt.*;
import javax.swing.JApplet;

public class GrandWelcomeLine extends JApplet
{
    public void paint( Graphics g)
    {
        super.paint(g);

        g.setColor(Color.red);

        g.setFont(new Font("Courier", Font.BOLD, 24));
        g.drawString("Welcome to Java Programming", 30, 30);

        g.drawLine(10, 10, 10, 40);    //left line
        g.drawLine(10, 40, 430, 40);   //bottom line
        g.drawLine(430, 40, 430, 10);  //right line
        g.drawLine(430, 10, 10, 10);   //top line
    }
}
