
//Recursion: Fibonacci Number

import java.util.*;

public class FibonacciNumber
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int firstFibNum;
        int secondFibNum;
        int nthFibonacci;

        System.out.print("Enter the first Fibonacci number: ");
        firstFibNum = console.nextInt();
        System.out.println();

        System.out.print("Enter the second Fibonacci number: ");
        secondFibNum = console.nextInt();
        System.out.println();

        System.out.print("Enter the position "
                       + "of the desired number in "
                       + "the Fibonacci \nsequence: ");
        nthFibonacci = console.nextInt();
        System.out.println();

        System.out.println("The " + nthFibonacci
                         + "th Fibonacci number of "
                         + "the sequence is: "
                         + rFibNum(firstFibNum, secondFibNum,
                                   nthFibonacci));
    }

    public static int rFibNum(int a, int b, int n)
    {
        if (n == 1)
            return a;
        else if (n == 2)
                 return b;
        else
            return rFibNum(a, b, n - 1) + rFibNum(a, b, n - 2);
    }
}
