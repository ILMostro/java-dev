//Welcome program with check boxes, radio buttons, and combo box

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GrandWelcomeFinal extends JApplet implements
                                               ItemListener
{
    private int intBold = Font.PLAIN;
    private int intItalic = Font.PLAIN;

    private Color currentColor = Color.black;
    private String currentFontName ="Courier";
    private JCheckBox boldCB, italicCB;
    private JRadioButton redRB, greenRB, blueRB;
    private ButtonGroup ColorSelectBGroup;
    private JComboBox fontFaceDD;

    private String[] fontNames
                     = {"Dialog", "Century Gothic",
                        "Courier", "Serif"};

    public void init()
    {
        Container c = getContentPane();
        c.setLayout(null);

        boldCB = new JCheckBox("Bold");
        italicCB = new JCheckBox("Italic");
        redRB = new JRadioButton("Red");
        greenRB = new JRadioButton("Green");
        blueRB = new JRadioButton("Blue");
        fontFaceDD = new JComboBox(fontNames);
        fontFaceDD.setMaximumRowCount(3);

        boldCB.setSize(80, 30);
        italicCB.setSize(80, 30);
        redRB.setSize(80, 30);
        greenRB.setSize(80, 30);
        blueRB.setSize(80, 30);
        fontFaceDD.setSize(80, 30);

        boldCB.setLocation(100, 70);
        italicCB.setLocation(100, 150);
        redRB.setLocation(300, 70);
        greenRB.setLocation(300, 110);
        blueRB.setLocation(300, 150);
        fontFaceDD.setLocation(200, 70);

        boldCB.addItemListener(this);
        italicCB.addItemListener(this);
        redRB.addItemListener(this);
        greenRB.addItemListener(this);
        blueRB.addItemListener(this);
        fontFaceDD.addItemListener(this);

        c.add(boldCB);
        c.add(italicCB);
        c.add(redRB);
        c.add(greenRB);
        c.add(blueRB);

        c.add(fontFaceDD);
        ColorSelectBGroup = new ButtonGroup();
        ColorSelectBGroup.add(redRB);
        ColorSelectBGroup.add(greenRB);
        ColorSelectBGroup.add(blueRB);
    }

    public void paint(Graphics g)
    {
        super.paint(g);

        g.setColor(Color.orange);
        g.drawRoundRect(75, 50, 324, 140, 10, 10);
        g.drawLine(183, 50, 183, 190);
        g.drawLine(291, 50, 291, 190);

        g.setColor(currentColor);
        g.setFont(new Font(currentFontName,
                           intBold + intItalic, 24));
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

        if (e.getSource() == fontFaceDD)
            currentFontName =
                       fontNames[fontFaceDD.getSelectedIndex()];

       repaint();
    }
}
