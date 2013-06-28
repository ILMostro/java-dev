
import javax.swing.JOptionPane;

public class ExceptionExample4
{
    public static void main(String[] args)            //Line 1
    {
        int dividend, divisor, quotient;              //Line 2
        String inpStr;                                //Line 3

        try                                           //Line 4
        {
            inpStr =
                 JOptionPane.showInputDialog
                     ("Enter the dividend: ");        //Line 5
            dividend = Integer.parseInt(inpStr);      //Line 6

            inpStr =
                 JOptionPane.showInputDialog
                     ("Enter the divisor: ");         //Line 7
            divisor = Integer.parseInt(inpStr);       //Line 8

            quotient = dividend / divisor;            //Line 9

            JOptionPane.showMessageDialog(null,
                      "Line 10:\nDividend = " + dividend
                    + "\nDivisor = " + divisor
                    + "\nQuotient =" + quotient,
                      "Quotient",
                   JOptionPane.INFORMATION_MESSAGE);  //Line 10
        }
        catch (ArithmeticException aeRef)             //Line 11
        {
            JOptionPane.showMessageDialog(null,
                    "Line 12: Exception "
                    + aeRef.toString(),
                    "ArithmeticException",
                    JOptionPane.ERROR_MESSAGE);       //Line 12
        }
        catch (NumberFormatException nfeRef)          //Line 13
        {
            JOptionPane.showMessageDialog(null,
                    "Line 14: Exception "
                    + nfeRef.toString(),
                    "NumberFormatException",
                    JOptionPane.ERROR_MESSAGE);       //Line 14
        }

        System.exit(0);                               //Line 15
    }
}


