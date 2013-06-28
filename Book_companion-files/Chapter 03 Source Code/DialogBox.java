import javax.swing.JOptionPane;

public class DialogBox
{
   public static void main(String[] args)
   {
      String name;
      String str;
      int num1 = 45;
      int num2 = 56;
      int sum;

      name =
        JOptionPane.showInputDialog("Enter your name and press OK");

      JOptionPane.showMessageDialog(null, "Hello World!",
                                   "Greetings",
                                JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, "Amount Due = $" + 500.45,
                                  "Invoice",
                                  JOptionPane.PLAIN_MESSAGE);

      str = "The two numbers are: " + num1 + " and " + num2 + "\n";
      sum = num1 + num2;

      str = str + "The sum of the numbers is: " + sum  + "\n";
      str =  str + "That is all for now!";

      JOptionPane.showMessageDialog(null, str, "Summing Numbers",
                                    JOptionPane.ERROR_MESSAGE);
      System.exit(0);
   }
}