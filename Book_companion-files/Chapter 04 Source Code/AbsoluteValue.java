//Program to determine the absolute value of an integer.

import javax.swing.JOptionPane;

public class AbsoluteValue
{
   public static void main(String[] args)
   {
      int number;
      int temp;
      String numString;

      numString =
        JOptionPane.showInputDialog("Enter an integer:"); //Line 1

      number = Integer.parseInt(numString);               //Line 2
      temp = number;                                      //Line 3

      if (number < 0)                                     //Line 4
         number = -number;                                //Line 5

      JOptionPane.showMessageDialog(null,
                     "The absolute value of " + temp
                   + " is " + number,
                     "Absolute Value",
                     JOptionPane.INFORMATION_MESSAGE);    //Line 6
      System.exit(0);
   }
}
