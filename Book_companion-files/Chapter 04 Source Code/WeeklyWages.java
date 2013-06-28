//Weekly Wages

import java.util.*;

public class WeeklyWages
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        double wages, rate, hours;                      //Line 1

        System.out.print("Line 2: Enter the working "
                       + "hours: ");                    //Line 2
        hours = console.nextDouble();                   //Line 3
        System.out.println();                           //Line 4

        System.out.print("Line 5: Enter the pay "
                       + "rate: ");                     //Line 5
        rate = console.nextDouble();                    //Line 6
        System.out.println();                           //Line 7

        if (hours > 40.0)                               //Line 8
            wages = 40.0 * rate +
                    1.5 * rate * (hours - 40.0);        //Line 9
        else                                            //Line 10
            wages = hours * rate;                       //Line 11

        System.out.printf("Line 12: The wages are $%.2f %n",
                           wages);                      //Line 12
        System.out.println();                           //Line 13
    }
}

