

//Program: Larger of two numbers

import java.util.*;

public class LargerNumber
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        double num1;                                   //Line 1
        double num2;                                   //Line 2

        System.out.println("Line 3: The larger of "
                         + "5.6 and 10.8 is "
                         + larger(5.6, 10.8));         //Line 3

        System.out.print("Line 4: Enter two "
                       + "numbers: ");                 //Line 4
        num1 = console.nextDouble();                   //Line 5
        num2 = console.nextDouble();                   //Line 6
        System.out.println();                          //Line 7

        System.out.println("Line 8: The larger of "
                      + num1 + " and " + num2 + " is "
                      + larger(num1, num2));           //Line 8
    }

    public static double larger(double x, double y)
    {
        double max;

        if (x >= y)
            max = x;
        else
            max = y;

        return max;
    }
}
