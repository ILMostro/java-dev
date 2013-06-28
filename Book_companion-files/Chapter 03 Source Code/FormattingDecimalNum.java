
//Program to illustrate how to format the outputting of
//decimal numbers.

public class FormattingDecimalNum
{
    public static void main (String[] args)
    {
        double x = 15.674;                              //Line 1
        double y = 235.73;                              //Line 2
        double z = 9525.9864;                           //Line 3

        System.out.println("Line 4: The values of x, "
                         + "y, and z with two decimal "
                         + "places.");                  //Line 4
        System.out.printf("Line 5: x = %.2f %n", x);    //Line 5
        System.out.printf("Line 6: y = %.2f %n", y);    //Line 6
        System.out.printf("Line 7: z = %.2f %n", z);    //Line 7

        System.out.println("Line 8: The values of x, "
                         + "y, and z with three decimal "
                         + "places.");                  //Line 8
        System.out.printf("Line 9: x = %.3f %n", x);    //Line 9
        System.out.printf("Line 10: y = %.3f %n", y);   //Line 10
        System.out.printf("Line 11: z = %.3f %n", z);   //Line 11
    }
}
