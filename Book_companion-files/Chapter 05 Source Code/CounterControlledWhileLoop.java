//Counter-controlled while loop

import java.util.*;

public class CounterControlledWhileLoop
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
            number = console.nextInt();                  //Line 8
            sum = sum + number;                          //Line 9
            counter++;                                   //Line 10
        }

        System.out.printf("Line 11: The sum of the %d " +
                        "numbers = %d%n", limit, sum);   //Line 11

        if (counter != 0)                                //Line 12
            System.out.printf("Line 13: The average = %d%n",
                              (sum / counter));          //Line 13
        else                                             //Line 14
            System.out.println("Line 15: No input.");    //Line 15
    }
}



