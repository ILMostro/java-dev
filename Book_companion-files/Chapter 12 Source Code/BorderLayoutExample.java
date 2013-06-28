//Program to illustrate BorderLayout

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame
{
    private static int WIDTH = 350;
    private static int HEIGHT = 300;

          //GUI components
    private JLabel labelJL;
    private JTextField textFieldTF;
    private JButton buttonJB;
    private JCheckBox checkboxCB;
    private JRadioButton radioButtonRB;
    private JTextArea textAreaTA;

    private BorderLayout borderLayoutMgr;

    public BorderLayoutExample()
    {
        setTitle("BorderLayout Manager");
        Container pane  = getContentPane();
        setSize(WIDTH, HEIGHT);

        borderLayoutMgr = new BorderLayout(10, 10);
        pane.setLayout(borderLayoutMgr);

        labelJL = new JLabel("North Component");
        textAreaTA = new JTextArea(10, 20);
        textAreaTA.setText("South Component.\n");
        textAreaTA.append(
           "Use the mouse to change the size of the window.");
        buttonJB = new JButton("West Component");
        checkboxCB =new JCheckBox("East Component");
        radioButtonRB = new JRadioButton("Center Component");

        pane.add(labelJL,BorderLayout.NORTH);
        pane.add(textAreaTA,BorderLayout.SOUTH);
        pane.add(buttonJB,BorderLayout.EAST);
        pane.add(checkboxCB,BorderLayout.WEST);
        pane.add(radioButtonRB, BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
         BorderLayoutExample flow = new BorderLayoutExample();
    }
}
