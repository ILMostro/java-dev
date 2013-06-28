//Program illustrating autoboxing and unboxing
//of Integer objects.

public class IntegerClassExample
{
    public static void main(String[] args)
    {
        int   x, y;                                 //Line 1
	    Integer num1, num2;                         //Line 2

		num1 = 8;     //Autobox 8                   //Line 3
		num2 = 16;    //Autobox 16                  //Line 4

		System.out.println("Line 5: num1 = " + num1
		                 + ", num2 = " + num2);     //Line 5

		x = num1 + 4;                               //Line 6

		System.out.println("Line 7: x = " + x);     //Line 7

		y = num1 + num2;                            //Line 8

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
		                 + "2 * num1 >= num2 is "
                         + (2 * num1 >= num2));     //Line 14
    }
}

