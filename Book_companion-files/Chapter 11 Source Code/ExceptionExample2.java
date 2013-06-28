
import java.util.*;

public class ExceptionExample2
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int dividend, divisor, quotient;           //Line 1

        System.out.print("Line 2: Enter the "
                       + "dividend: ");            //Line 2
        dividend = console.nextInt();              //Line 3
        System.out.println();                      //Line 4

        System.out.print("Line 5: Enter the "
                       + "divisor: ");             //Line 5
        divisor = console.nextInt();               //Line 6
        System.out.println();                      //Line 7

        if (divisor != 0)                          //Line 8
        {
            quotient = dividend / divisor;         //Line 9
            System.out.println("Line 10: "
                             + "Quotient = "
                             + quotient);          //Line 10
        }
        else
            System.out.println("Line 11: Cannot "
                             + "divide by zero."); //Line 11
    }
}

