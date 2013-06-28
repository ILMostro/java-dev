//Program illustrating how the operator == and the
//method equals works with Double objects.

public class DoubleClassMethodEquals
{
    public static void main(String[] args)
    {
	    Double num1, num2;                          //Line 1

		num1 = 2567.58;                             //Line 2
		num2 = 2567.58;                             //Line 3

        System.out.println("Line 4: num1 = " + num1
		                 + ", num2 = " + num2);     //Line 4

		System.out.println("Line 5: The value of "
		                 + "num1.equals(num2) is "
		                 + num1.equals(num2));      //Line 5

		System.out.println("Line 6: The value of "
				         + "num1 == num2 is "
		                 + (num1 == num2));         //Line 6
    }
}

