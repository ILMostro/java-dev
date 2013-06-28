/** This is a Javadoc comment, which are used to document code; the documented code
 * can then be turned into an HTML page, that will be helpful to others.
 */

/*
 * A java comment (multiple-line comment), which usually begins with "/*" with an
 * asterisk '*' at the beginning of every line to indicate that the comment has not
 * been completed.
 *
 * In order to close out the comment, the programmer has to conclude the section
 * with a '*' followed by a '/'
 * 
 */

//************************************************************************
//Single-line comments begin with "//"

import java.util.*;	//single-line comments can be placed anywhere 
import javax.swing.*;

public class Learning1
{
    public static void main(String[] args)
    {
      double radius;
      double area;
      double circumference;

      String radiusString;
      String outputStr;

      radiusString =
          JOptionPane.showInputDialog
                    ("Enter the radius: ");

      radius = Double.parseDouble(radiusString);

      area = Math.PI * radius * radius;
      circumference = 2 * Math.PI * radius;

      outputStr = "Radius: " + radius + "\n" +
                "Area: " + area + " square units\n" +
               "Circumference: " + circumference +
               " units";

      JOptionPane.showMessageDialog(null, outputStr, "Circle",
              JOptionPane.INFORMATION_MESSAGE);

      System.exit(0);
    }
}




