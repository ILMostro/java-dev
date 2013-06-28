//Java program to create a window
//and place four labels and four text fields

import javax.swing.*;
import java.awt.*;

public class RectangleProgramThree extends JFrame
{
   private static final int WIDTH = 400;
   private static final int HEIGHT = 300;

   private JLabel lengthL, widthL, areaL, perimeterL;
   private JTextField lengthTF, widthTF, areaTF,
                       perimeterTF;

   public RectangleProgramThree()
   {
      setTitle("Area and Perimeter of a Rectangle");

      lengthL =
          new JLabel("Enter the length: ", SwingConstants.RIGHT);
      widthL =
          new JLabel("Enter the width: ", SwingConstants.RIGHT);
      areaL =
          new JLabel("Area: ", SwingConstants.RIGHT);
      perimeterL =
          new JLabel("Perimeter: ", SwingConstants.RIGHT);

      lengthTF = new JTextField(10);
      widthTF = new JTextField(10);
      areaTF = new JTextField(10);
      perimeterTF = new JTextField(10);

      Container pane = getContentPane();
      pane.setLayout(new GridLayout(4, 2));

      pane.add(lengthL);
      pane.add(lengthTF);
      pane.add(widthL);
      pane.add(widthTF);
      pane.add(areaL);
      pane.add(areaTF);
      pane.add(perimeterL);
      pane.add(perimeterTF);

      setSize(WIDTH, HEIGHT);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public static void main(String[] args)
   {
      RectangleProgramThree rectObject =
                          new RectangleProgramThree();
   }
}

