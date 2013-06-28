
//Program to read five numbers, find their sum, and
//print the numbers in the reverse order.

import java.util.*;

public class ReversePrintII
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] items = new int[5]; //declare an array item of
                                  //five elements
        int sum;

        System.out.println("Enter five integers:");

        sum = 0;

        for (int counter = 0; counter < items.length;
                                        counter++)
        {
            items[counter] = console.nextInt();
            sum = sum + items[counter];
        }

        System.out.println("The sum of the numbers = "
                          + sum);
        System.out.print("The numbers in the reverse "
                       + "order are: ");

           //print the numbers in the reverse order
        for (int counter = items.length - 1; counter >= 0;
                                             counter--)
            System.out.print(items[counter] + " ");

        System.out.println();

    }
}
