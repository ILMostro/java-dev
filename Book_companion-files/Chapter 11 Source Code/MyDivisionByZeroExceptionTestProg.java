
import java.util.*;

public class MyDivisionByZeroExceptionTestProg
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        double numerator;                              //Line 1
        double denominator;                            //Line 2

        try                                            //Line 3
        {
            System.out.print("Line 4: Enter the "
                           + "numerator: ");           //Line 4
            numerator = console.nextDouble();          //Line 5
            System.out.println();                      //Line 6

            System.out.print("Line 7: Enter the "
                           + "denominator: ");         //Line 7
            denominator = console.nextDouble();        //Line 8
            System.out.println();                      //Line 9

            if (denominator == 0.0)                    //Line 10
               throw new MyDivisionByZeroException();  //Line 11

            System.out.println("Line 12: Quotient = "
                       + (numerator / denominator));   //Line 12
        }
        catch (MyDivisionByZeroException mdbze)        //Line 13
        {
            System.out.println("Line 14: "
                              + mdbze.toString());     //Line 14
        }
        catch (Exception e)                            //Line 15
        {
            System.out.println("Line 16: "
                              + e.toString());         //Line 16
        }
    }
}




