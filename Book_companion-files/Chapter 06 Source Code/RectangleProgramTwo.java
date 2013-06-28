//Java program to create a window and place four labels

import javax.swing.*;
import java.awt.*;

public class RectangleProgramTwo extends JFrame
{
   private static final int WIDTH = 400;
   private static final int HEIGHT = 300;

   private JLabel lengthL, widthL, areaL, perimeterL;

   public RectangleProgramTwo()
   {
       setTitle("Area and Perimeter of a Rectangle");

       lengthL =
          new JLabel("Enter the length: ", SwingConstants.RIGHT);
       widthL =
          new JLabel("Enter the width: ", SwingConstants.RIGHT);
       areaL = new JLabel("Area: ", SwingConstants.RIGHT);
       perimeterL =
          new JLabel("Perimeter: ", SwingConstants.RIGHT);

       Container pane = getContentPane();
       pane.setLayout(new GridLayout(4, 1));

       pane.add(lengthL);
       pane.add(widthL);
       pane.add(areaL);
       pane.add(perimeterL);

       setSize(WIDTH, HEIGHT);
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public static void main(String[] args)
   {
       RectangleProgramTwo rectObject = new RectangleProgramTwo();
   }
}

