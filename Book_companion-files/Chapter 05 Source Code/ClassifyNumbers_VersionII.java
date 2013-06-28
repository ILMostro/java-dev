
//********************************************************
// Author: D.S. Malik
//
// Program: Classify Numbers
// This program counts the number of odd and even numbers.
// The program also counts the number of zeros.
//********************************************************

import java.util.*;

public class ClassifyNumbers_VersionII
{
    static Scanner console = new Scanner(System.in);

    static final int N = 20;

    public static void main (String[] args)
    {
              //Declare the variables
        int counter;  //loop control variable
        int number;   //variable to store the new number

        int zeros = 0;                              //Step 1
        int odds = 0;                               //Step 1
        int evens = 0;                              //Step 1

        System.out.println("Please enter " + N
                         + " integers, positive, "
                         + "negative, or zeros.");  //Step 2

        for (counter = 1; counter <= N; counter++)  //Step 3
        {
            number = console.nextInt();             //Step 3a
            System.out.print(number + " ");         //Step 3b

                 //Step 3c
            if (number % 2 == 0)
            {
                evens++;
                if (number == 0)
                    zeros++;
            }
            else
                odds++;
        }//end for loop

        System.out.println();

                 //Step 4
        System.out.println("There are " + evens + " evens, "
                         + "which also includes "
                         + zeros + " zeros");
        System.out.println("Total number of odds is: " + odds);
    }
}

