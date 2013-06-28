
import java.util.*;

public class ExceptionExample3A
{
    static Scanner console = new Scanner(System.in);

    public static void main (String[] args)                //Line 1
    {
        int dividend, divisor, quotient;                   //Line 2

        try                                                //Line 3
        {
            System.out.print("Line 4: Enter the "
                           + "dividend: ");                //Line 4
            dividend = console.nextInt();                  //Line 5
            System.out.println();                          //Line 6

            System.out.print("Line 7: Enter the "
                           + "divisor: ");                 //Line 7
            divisor = console.nextInt();                   //Line 8
            System.out.println();                          //Line 9

            quotient = dividend / divisor;                 //Line 10
            System.out.println("Line 11: Quotient = "
                              + quotient);                 //Line 11
        }
        catch (ArithmeticException aeRef)                  //Line 12
        {
            System.out.println("Line 13: Exception "
                              + aeRef.toString());         //Line 13
        }
        catch (InputMismatchException imeRef)              //Line 14
		{
		    String str;                                    //Line 15

		    str = console.next();                          //Line 16
		    System.out.println("Line 17: Exception "
		                       + imeRef.toString()
		                       + " " + str );              //Line 17
        }
    }
}
