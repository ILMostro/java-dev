
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WhiteBoard extends JFrame
                        implements ActionListener
{
    private static int WIDTH = 550;
    private static int HEIGHT = 350;

    private int row = 10;
    private int col = 20;

         //GUI components
    private JLabel headingL;
    private JTextField lineTF;
    private JTextArea whiteBoardTA;
    private JButton exitB, appendB;

    public WhiteBoard()
    {
        setTitle("White Board");
        Container pane  = getContentPane();
        setSize(WIDTH,HEIGHT);

        headingL = new JLabel("Welcome to White Board");
        lineTF = new JTextField(20);

        whiteBoardTA = new JTextArea(row,col);
        exitB = new JButton("Exit");
        exitB.addActionListener(this);

        appendB = new JButton("Append");
        appendB.addActionListener(this);

        pane.setLayout(null);

        headingL.setLocation(50, 20);
        lineTF.setLocation(20, 100);
        whiteBoardTA.setLocation(320, 50);
        appendB.setLocation(230, 100);
        exitB.setLocation(230, 250);

        headingL.setSize(200, 30);
        lineTF.setSize(200, 30);
        whiteBoardTA.setSize(200, 200);
        appendB.setSize(80, 30);
        exitB.setSize(80, 30);

        pane.add(headingL);
        pane.add(lineTF);
        pane.add(whiteBoardTA);
        pane.add(appendB);
        pane.add(exitB);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    } //end of the constructor

    public static void main(String[] args)
    {
         WhiteBoard board = new WhiteBoard();
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Append"))
           whiteBoardTA.append(lineTF.getText());
        else if(e.getActionCommand().equals("Exit"))
            System.exit(0);
    }
}
