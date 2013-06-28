//Welcome Applet with check boxes

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GrandWelcomeCheckBox extends JApplet implements
                                                  ItemListener
{
    private int intBold = Font.PLAIN;
    private int intItalic = Font.PLAIN;
    private JCheckBox boldCB, italicCB;

    public void init()
    {
        Container c = getContentPane();
        c.setLayout(null);
        boldCB = new JCheckBox("Bold");
        italicCB = new JCheckBox("Italic");

        boldCB.setSize(100, 30);
        italicCB.setSize(100,30);

        boldCB.setLocation(100, 100);
        italicCB.setLocation(300, 100);

        boldCB.addItemListener(this);
        italicCB.addItemListener(this);

        c.add(boldCB);
        c.add(italicCB);
    }

    public void paint( Graphics g)
    {
        super.paint(g);
        g.setColor(Color.red);
        g.setFont(new Font("Courier", intBold + intItalic, 24));
        g.drawString("Welcome to Java Programming", 30, 30);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if (e.getSource() == boldCB)
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
                intBold = Font.BOLD;
            if (e.getStateChange() == ItemEvent.DESELECTED)
                intBold = Font.PLAIN;
        }

        if (e.getSource() == italicCB)
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
                intItalic = Font.ITALIC;
            if (e.getStateChange() == ItemEvent.DESELECTED)
                intItalic = Font.PLAIN;
        }

        repaint();
    }
}
