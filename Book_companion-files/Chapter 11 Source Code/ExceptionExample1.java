
import java.util.*;

public class ExceptionExample1
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

        quotient = dividend / divisor;             //Line 8

        System.out.println("Line 9: Quotient = "
                         + quotient);              //Line 9
    }
}

