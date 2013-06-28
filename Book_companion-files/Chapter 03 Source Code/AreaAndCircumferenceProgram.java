
//Program to determine the area and circumference of a circle

import javax.swing.JOptionPane;

public class AreaAndCircumferenceProgram
{
   public static void main(String[] args)
   {
      double radius;                                 //Line 1
      double area;                                   //Line 2
      double circumference;                          //Line 3

      String radiusString;                           //Line 4
      String outputStr;                              //Line 5

      radiusString =
        JOptionPane.showInputDialog
                    ("Enter the radius: ");          //Line 6

      radius = Double.parseDouble(radiusString);     //Line 7

      area = Math.PI * radius * radius;              //Line 8
      circumference = 2 * Math.PI * radius;          //Line 9

      outputStr = "Radius: " + radius + "\n" +
                  "Area: " + area + " square units\n" +
                  "Circumference: " + circumference +
                  " units";                          //Line 10

      JOptionPane.showMessageDialog(null, outputStr,
                                    "Circle",
                   JOptionPane.INFORMATION_MESSAGE); //Line 11

      System.exit(0);                                //Line 12
   }
}


