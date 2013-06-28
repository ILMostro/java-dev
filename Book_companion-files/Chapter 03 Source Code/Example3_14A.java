
//This program is the same as the program StringMethodFormat.
//In this program, the output is shown in an output dialog box.

import javax.swing.JOptionPane;

public class Example3_14A
{
   public static void main(String[] args)
   {
      double x = 15.674;
      double y = 235.73;
      double z = 9525.9864;
      int num = 83;
      String outputStr;

      outputStr = "123456789012345678901234567890" + '\n'
               + String.format("%.2f %n", x)
               + String.format("%.3f %n", y)
               + String.format("%.2f %n", z)
               + String.format("%7s %n", "Hello")
               + String.format("%5d%7.2f %n", num, x)
               + String.format("The value of num = %5d %n", num);

      JOptionPane.showMessageDialog(null, outputStr, "outputStr",
                               JOptionPane.INFORMATION_MESSAGE);

      System.exit(0);
   }
}