//Program illustrating autoboxing and unboxing
//of Double objects.

public class DoubleClassExample
{
    public static void main(String[] args)
    {
        double   x, y;                              //Line 1
	    Double num1, num2;                          //Line 2

		num1 = 8.5;     //Autobox 8.5               //Line 3
		num2 = 17.0;    //Autobox 17.0              //LIne 4

		System.out.println("Line 5: num1 = " + num1
		                 + ", num2 = " + num2);     //Line 5

		x = num1 + 4;  //Unbox num1, add 4, and     //Line 6
		               //store the result in x;

		System.out.println("Line 7: x = " + x);     //Line 7

		y = num1 + num2;  //Unbox num1, num2, add   //Line 8
		                  //the values and store
		                  //the result in y

		System.out.println("Line 9: y = " + y);     //Line 9

        System.out.println("Line 10: The value of "
                         + "2 * num1 + num2 = "
	                     + (2 * num1 + num2));      //Line 10

        System.out.println("Line 11: The value of "
		                 + "x * num2 - num1 = "
	                     + (x * num2 - num1));      //Line 11

        System.out.println("Line 12: The value of "
                         + "num1 <= num2 is "
                         + (num1 <= num2));         //Line 12

        System.out.println("Line 13: The value of "
                         + "2 * num1 <= x is "
                         + (2 * num1 <= x));        //Line 13

        System.out.println("Line 14: The value of "
		                 + "2 * num1 == num2 is "
                         + (2 * num1 == num2));     //Line 14

    }
}

