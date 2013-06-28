// This Java Program determines the area and
// perimeter of a rectangle.

import javax.swing.JOptionPane;

public class Rectangle
{
    public static void main(String[] args)
    {
        double width, length, area, perimeter;                   //Line 1

        String lengthStr, widthStr, outputStr;                   //Line 2

        lengthStr =
              JOptionPane.showInputDialog("Enter the length: "); //Line 3
        length = Double.parseDouble(lengthStr);                  //Line 4

        widthStr =
               JOptionPane.showInputDialog("Enter the width: "); //Line 5
        width = Double.parseDouble(widthStr);                    //Line 6

        area = length * width;                                   //Line 7
        perimeter = 2 * (length + width);                        //Line 8

        outputStr = "Length: " + length + "\n" +
                    "Width: " + width + "\n" +
                    "Area: " + area + " square units\n" +
                    "Perimeter: " + perimeter + " units\n";      //Line 9

        JOptionPane.showMessageDialog(null, outputStr,
                             "Rectangle",
                             JOptionPane.INFORMATION_MESSAGE);   //Line 10

        System.exit(0);                                          //Line 11
    }
}
