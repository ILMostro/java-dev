//While loop without the break statement

import java.util.*;

public class WhileLoopWithOutBreak
{
	static Scanner console = new Scanner(System.in);

	public static void main (String[] args)
	{
		int num;
      	int sum;

	    boolean isNegative;

      	sum = 0;
	    isNegative = false;

      	System.out.print("Enter positive integers: ");

      	while (console.hasNext() && !isNegative)
      	{
          	num = console.nextInt();

          	if (num < 0)  //if number is negative, terminate the loop
                          //after this iteration
          	{
	            System.out.println("Negative number found in the data.");
	            isNegative = true;
          	}
          	else
	            sum = sum + num;
      	}

		System.out.println();
	    System.out.println("The sum is: " + sum);
	}
}