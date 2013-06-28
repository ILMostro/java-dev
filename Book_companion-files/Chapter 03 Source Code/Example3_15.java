

import javax.swing.JOptionPane;

public class Example3_15
{
   public static void main(String[] args)
   {
      double x = 15.674;
      double y = 235.73;
      double z = 9525.9864;
      String str;

      str = String.format("The value of x with two decimal "
                        + "places = %.2f%n", x)
          + String.format("The value of y with two decimal "
                        + "places = %.2f%n", y)
          + String.format("The value of z with two decimal "
                        + "places = %.2f%n", z);

      JOptionPane.showMessageDialog(null, str,
                   "Formatting with the String Method format",
                   JOptionPane.INFORMATION_MESSAGE);

      System.exit(0);
   }
}
