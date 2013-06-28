import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GrandWelcomeRButton extends JApplet implements
                                                 ItemListener
{
    private int intBold = Font.PLAIN;
    private int intItalic = Font.PLAIN;
    private Color currentColor = Color.black;
    private JCheckBox boldCB, italicCB;
    private JRadioButton redRB, greenRB, blueRB;
    private ButtonGroup ColorSelectBGroup;

    public void init()
    {
        Container c = getContentPane();
        c.setLayout(null);

        boldCB = new JCheckBox("Bold");
        italicCB = new JCheckBox("Italic");
        redRB = new JRadioButton("Red");
        greenRB = new JRadioButton("Green");
        blueRB = new JRadioButton("Blue");

        boldCB.setSize(100, 30);
        italicCB.setSize(100, 30);
        redRB.setSize(100, 30);
        greenRB.setSize(100, 30);
        blueRB.setSize(100, 30);

        boldCB.setLocation(100, 70);
        italicCB.setLocation(100, 150);
        redRB.setLocation(300, 70);
        greenRB.setLocation(300, 110);
        blueRB.setLocation(300, 150);

        boldCB.addItemListener(this);
        italicCB.addItemListener(this);
        redRB.addItemListener(this);
        greenRB.addItemListener(this);
        blueRB.addItemListener(this);

        c.add(boldCB);
        c.add(italicCB);
        c.add(redRB);
        c.add(greenRB);
        c.add(blueRB);

        ColorSelectBGroup = new ButtonGroup();
        ColorSelectBGroup.add(redRB);
        ColorSelectBGroup.add(greenRB);
        ColorSelectBGroup.add(blueRB);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.orange);
        g.drawRoundRect(75, 50, 125, 140, 10, 10);
        g.drawRoundRect(275, 50, 125, 140, 10, 10);
        g.setColor(currentColor);
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

        if (e.getSource() == redRB)
            currentColor = Color.red;
        else if (e.getSource() == greenRB)
            currentColor = Color.green;
        else if (e.getSource() == blueRB)
            currentColor = Color.blue;

       repaint();
    }
}
