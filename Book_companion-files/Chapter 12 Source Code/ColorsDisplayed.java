//ColorsDisplayed Applet

import java.awt.*;
import javax.swing.*;

public class ColorsDisplayed extends JApplet
{
   JLabel topleftJL, toprightJL, bottomleftJL, bottomrightJL;

   int i;
   float red, green, blue;

   public void init()
   {
      Container c = getContentPane();

      c.setLayout(new GridLayout(2, 2));
      c.setBackground(Color.white);

      topleftJL = new JLabel("Red", SwingConstants.CENTER);
      toprightJL = new JLabel("Green", SwingConstants.CENTER);
      bottomleftJL = new JLabel("Blue",
                                 SwingConstants.CENTER);
      bottomrightJL = new JLabel("Random",
                                 SwingConstants.CENTER);

      topleftJL.setForeground(Color.red);
      toprightJL.setForeground(Color.green);
      bottomleftJL.setForeground(Color.blue);

      red = (float) Math.random();
      green = (float) Math.random();
      blue = (float) Math.random();
      bottomrightJL.setForeground(new Color(red, green, blue));

      c.add(topleftJL);
      c.add(toprightJL);
      c.add(bottomleftJL);
      c.add(bottomrightJL);
   }
}
