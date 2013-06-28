//Sentinel-controlled while loop

import java.util.*;

public class SentinelControlledWhileLoop
{
    static Scanner console = new Scanner(System.in);

    static final int SENTINEL = -999;

    public static void main (String[] args)
    {
        int number;       //variable to store the number
        int sum = 0;      //variable to store the sum
        int count = 0;    //variable to store the total
                          //numbers read

        System.out.println("Line 1: Enter positive integers "
                         + "ending with " + SENTINEL);   //Line 1

        number = console.nextInt();                      //Line 2

        while (number != SENTINEL)                       //Line 3
        {
            sum = sum + number;                          //Line 4
            count++;                                     //Line 5
            number = console.nextInt();                  //Line 6
        }

        System.out.printf("Line 7: The sum of the %d " +
                       "numbers = %d%n", count, sum);    //Line 7

        if (count != 0)                                  //Line 8
            System.out.printf("Line 9: The average = %d%n",
                              (sum / count));            //Line 9
        else                                             //Line 10
            System.out.println("Line 11: No input.");    //Line 11
    }
}


