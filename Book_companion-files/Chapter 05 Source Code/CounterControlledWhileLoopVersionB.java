//Counter-controlled while loop

import java.util.*;

public class CounterControlledWhileLoopVersionB
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int limit;      //store the number of items
                        //in the list
        int number;     //variable to store the number
        int sum;        //variable to store the sum
        int counter;    //loop control variable

        System.out.print("Line 1: Enter the number of "
                       + "integers in the list: ");      //Line 1

        limit = console.nextInt();                       //Line 2
        System.out.println();                            //Line 3

        sum = 0;                                         //Line 4
        counter = 0;                                     //Line 5
        System.out.println("Line 6: Enter " + limit
                         + " integers.");                //Line 6

        while (counter < limit)                          //Line 7
        {
            sum = sum + console.nextInt();               //Line 8
            counter++;                                   //Line 9
        }

        System.out.printf("Line 10: The sum of the %d " +
                        "numbers = %d%n", limit, sum);   //Line 10

        if (counter != 0)                                //Line 11
            System.out.printf("Line 12: The average = %d%n",
                              (sum / counter));          //Line 12
        else                                             //Line 13
            System.out.println("Line 14: No input.");    //Line 14
    }
}



