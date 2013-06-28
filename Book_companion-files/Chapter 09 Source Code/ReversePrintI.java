
//Program to read five numbers, find their sum, and print the
//numbers in the reverse order.

import java.util.*;

public class ReversePrintI
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int item0, item1, item2, item3, item4;
        int sum;

        System.out.println("Enter five integers: ");
        item0 = console.nextInt();
        item1 = console.nextInt();
        item2 = console.nextInt();
        item3 = console.nextInt();
        item4 = console.nextInt();

        sum = item0 + item1 + item2 + item3 + item4;

        System.out.println("The sum of the numbers = " + sum);
        System.out.print("The numbers in reverse order are: ");
        System.out.println(item4 + " " + item3 + " " + item2
                           + " " + item1 + " " + item0);
    }
}

