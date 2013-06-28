//Program: Method Signature
//Shows syntax error
//Signature refers to the method name and parameter list
//not the return type.

import java.util.*;

public class MethodSignature
{
    static Scanner console = new Scanner(System.in);

    public static void main (String[] args)
    {
        int a;
        double b;

        test(a, b);

        System.out.println("a = " + a + ", b = ",
                           b + ", test(a, b) = ", test(a, b));
    }

    public static void test(int x, double y)
    {
        x = x + y;

        y = 2 * y;
    }

    public static double test(int x, double y)
    {
        y = 2 * x;

        return y;
    }
}
