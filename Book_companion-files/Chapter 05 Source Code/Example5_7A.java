
import java.util.*;

public class Example5_7A
{
	static Scanner console = new Scanner(System.in);

    public static void main (String[] args)
    {
       	int sum = 0;    //variable to store the sum
       	int num;        //variable to store the number

       	System.out.println("Enter numbers.");

		while (console.hasNext())
		{
		    num = console.nextInt();  //Get the next number
		    sum = sum + num;          //Add the number to the sum
		}

		System.out.printf("Sum = %d%n", sum);

		console = new Scanner(System.in);

		num = console.nextInt();

		System.out.println("num = " + num);
    }
}

