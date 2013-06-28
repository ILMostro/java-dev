//Key Event

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OneChar extends JApplet
{
    JTextField oneLetter = new JTextField(1);

    public void init()
    {
        Container c = getContentPane();

          //register the listener object
        oneLetter.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                float red, green, blue;

                Color fg, bg;

                oneLetter.setText(" ");

                red = (float) Math.random();
                green = (float) Math.random();
                blue = (float) Math.random();

                fg = new Color(red, green, blue);
                bg = Color.white;

                oneLetter.setForeground(fg);
                oneLetter.setBackground(bg);
                oneLetter.setCaretColor(bg);
                oneLetter.setFont(new Font("Courier",
                                           Font.BOLD, 200));
            }
        });

        c.setLayout(new GridLayout(1, 1));
        c.setBackground(Color.white);
        c.add(oneLetter);

        JOptionPane.showMessageDialog
           (null, "Click on the applet, then type a key ",
           "Information", JOptionPane.PLAIN_MESSAGE );
    }
}
