
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.*;

public class FreeDrawApplet extends JApplet
                            implements MouseMotionListener
{
      //instance variables
    ColorCircle[] myGraph;

    final int NUM_CIRCLES = 7;
    final int WIDTH = 400;
    final int HEIGHT = 400;

    public class ColorCircle
    {
        private int x;
        private int y;

        public void setX(int iNewX)
        {
            x = iNewX;
        }

        public void setY(int iNewY)
        {
            y = iNewY;
        }

        public void paint (Graphics g)
        {
            g.fillOval(x - 10, y - 10, 20, 20);
        }

        public boolean selected(int iXcoord, int iYcoord)
        {
            if ((iXcoord >=x - 10) && (iXcoord <= x + 10)
                && (iYcoord >= y - 10) && (iYcoord <= y + 10))
                return true;
            else
                return false;
        }
    }

    public void init ()
    {
        addMouseMotionListener(this);
        myGraph = new ColorCircle[NUM_CIRCLES];

        for (int i = 0; i < NUM_CIRCLES; i++)
        {
           ColorCircle myVertex = new ColorCircle();

           myVertex.setX((int)(Math.random() * (WIDTH-50)));

           myVertex.setY((int)(Math.random() * (HEIGHT - 100)));

           myGraph[i] = myVertex;
        }

        JOptionPane.showMessageDialog(null,
              "Try to drag any one of the colored circles ",
              "Information", JOptionPane.PLAIN_MESSAGE );

    }

    public void paint(Graphics g)
    {
        Color[] myColor = {Color.black, Color.red, Color.blue,
                           Color.green, Color.cyan,
                           Color.orange, Color.yellow};

        if (NUM_CIRCLES > 0)
           for (int i = 0; i < NUM_CIRCLES; i++)
           {
               g.setColor(myColor[i]);
               myGraph[i].paint(g);
           }
    }

    public void mouseDragged(MouseEvent event)
    {
        int iX = event.getX();
        int iY = event.getY();

        for (int i = 0; i < NUM_CIRCLES; i++)
            if (myGraph[i].selected(iX, iY))
            {
               myGraph[i].setX(iX);
               myGraph[i].setY(iY);
               break;
            }

        repaint();

    }

    public void mouseMoved(MouseEvent p1)
    {
    }
}
