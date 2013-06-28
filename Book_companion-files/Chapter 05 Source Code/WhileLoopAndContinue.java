//While loop and the continue statement

import java.util.*;

public class WhileLoopAndContinue
{
	static Scanner console = new Scanner(System.in);

	public static void main (String[] args)
	{
		int num;
      	int sum;

      	sum = 0;

      	System.out.print("Enter positive integers: ");

        while (console.hasNext())
      	{
          	num = console.nextInt();

          	if (num < 0) //if number is negative, go to the next iteration
          	{
	        	System.out.println("Negative number found in the data.");
	        	continue;
          	}

          	sum = sum + num;
      	}

		System.out.println();
	   	System.out.println("The sum is: " + sum);
	}
}