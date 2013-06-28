//How to use the static methods of the classe Math and Character
//without using the following statements:
//import static java.lang.Math.*;
//import static java.lang.Character.*;

public class PredefinedMethodsVersionII
{
    public static void main(String[] args)
    {
        int   x;
	    double  u, v;

	    System.out.println("Line 1: Uppercase a is "
                           + Character.toUpperCase('a'));			//Line 1
        u = 4.2;						                     		//Line 2
	    v = 3.0;						                     		//Line 3
	    System.out.printf("Line 4: %.1f to the power of "
	                    + "%.1f = %.2f%n", u, v, Math.pow(u,v));  	//Line 4

	    System.out.printf("Line 5: 5 to the power of 4 = "
	                    + "%.2f%n", Math.pow(5,4));               	//Line 5

        u = u + Math.pow(3,3);					             		//Line 6
	    System.out.printf("Line 7: u = %.2f%n", u);	         		//Line 7

	    x = -15;						                     		//Line 8
	    System.out.printf("Line 9: The absolute value of %d = "
	                    + "%d%n", x, Math.abs(x));  	 	    	//Line 9
    }
}

