//Program to illustrate mouse events

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseExample extends JFrame
                          implements MouseListener
{
    private static int WIDTH = 350;
    private static int HEIGHT = 250;

         //GUI components
    private JLabel[] labelJL;

    public MouseExample()
    {
       setTitle("Mouse Events");
       Container pane  = getContentPane();
       setSize(WIDTH,HEIGHT);

       GridLayout gridMgr = new GridLayout(6, 1, 10, 10);
       pane.setLayout(gridMgr);

       labelJL = new JLabel[6];

       labelJL[0] = new JLabel("Mouse Clicked",
                             SwingConstants.CENTER);
       labelJL[1] = new JLabel("Mouse Entered",
                              SwingConstants.CENTER);
       labelJL[2] = new JLabel("Mouse Exited",
                             SwingConstants.CENTER);
       labelJL[3] = new JLabel("Mouse Pressed",
                             SwingConstants.CENTER);
       labelJL[4] = new JLabel("Mouse Released",
                             SwingConstants.CENTER);
       labelJL[5] = new JLabel("",SwingConstants.CENTER);

       for (int i = 0; i < labelJL.length; i++)
       {
          labelJL[i].setForeground(Color.gray);
          pane.add(labelJL[i]);
       }

       pane.addMouseListener(this);

       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent event)
    {
       for (int i = 0; i < labelJL.length; i++)
       {
          if (i == 0)
             labelJL[i].setForeground(Color.yellow);
          else
             labelJL[i].setForeground(Color.gray);
       }

       labelJL[5].setText("["+ event.getX() + ","
                       + event.getY()+"]");

    }

    public void mouseEntered(MouseEvent event)
    {
       for (int i = 0; i < labelJL.length; i++)
       {
           if (i == 1)
              labelJL[i].setForeground(Color.green);
           else
              labelJL[i].setForeground(Color.gray);
       }

       labelJL[5].setText("["+ event.getX() + ","
                        + event.getY()+"]");
    }

    public void mouseExited(MouseEvent event)
    {
       for (int i = 0; i < labelJL.length; i++)
       {
           if (i == 2)
              labelJL[i].setForeground(Color.red);
           else
              labelJL[i].setForeground(Color.gray);
       }

       labelJL[5].setText("["+ event.getX() + ","
                         + event.getY()+"]");
    }

    public void mousePressed(MouseEvent event)
    {
       for (int i = 0; i < labelJL.length; i++)
       {
           if (i == 3)
              labelJL[i].setForeground(Color.blue);
           else
              labelJL[i].setForeground(Color.gray);
       }

       labelJL[5].setText("["+ event.getX() + ","
                        + event.getY()+"]");
    }

    public void mouseReleased(MouseEvent event)
    {
       for (int i = 0; i < labelJL.length; i++)
       {
           if (i == 4)
              labelJL[i].setForeground(Color.pink);
           else
              labelJL[i].setForeground(Color.gray);
       }

       labelJL[5].setText("["+ event.getX() + ","
                       + event.getY()+"]");
    }

    public static void main(String[] args)
    {
        MouseExample flow = new MouseExample();
    }
}
