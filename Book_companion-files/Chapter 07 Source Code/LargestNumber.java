
//********************************************************
// Author D.S. Malik
//
// Program: Largest number
// This program determines the largest number of a set of
// 10 numbers.
//********************************************************

import java.util.*;

public class LargestNumber
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        double num;  //variable to hold the current number
        double max;  //variable to hold the larger number
        int count;   //loop control variable

        System.out.println("Enter 10 numbers:");

        num = console.nextDouble();                //Step 1
        max = num;                                 //Step 1

        for (count = 1; count < 10; count++)       //Step 2
        {
            num = console.nextDouble();            //Step 2a
            max = larger(max, num);                //Step 2b
        }

        System.out.println("The largest number is "
                          + max);                  //Step 3
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


