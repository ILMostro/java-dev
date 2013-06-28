 //While loop with the break statement

import java.util.*;

public class WhileLoopWithBreak
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

          	if (num < 0)   //if number is negative, terminate the loop
          	{
	            System.out.println("Negative number found in the data.");
	            break;
          	}

          	sum = sum + num;
      	}

		System.out.println();
	    System.out.println("The sum is: " + sum);
	}
}