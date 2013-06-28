
import java.util.*;

public class ExceptionExample5
{
   static Scanner console = new Scanner(System.in);

   public static void main(String[] args)                  //Line 1
   {
      int dividend, divisor, quotient;                     //Line 2

      try                                                  //Line 3
      {
          System.out.print("Line 4: Enter the "
                         + "dividend: ");                  //Line 4
          dividend = console.nextInt();                    //Line 5
          System.out.println();                            //Line 6

          System.out.print("Line 7: Enter the "
                         + "divisor: ");                   //Line 7
          divisor = console.nextInt();                     //Line 8
          System.out.println();                            //Line 9

          quotient = dividend / divisor;                   //Line 10
          System.out.println("Line 11: Quotient = "
                            + quotient);                   //Line 11
      }
      catch (Exception eRef)                               //Line 12
      {
          if (eRef instanceof ArithmeticException)         //Line 13
              System.out.println("Line 14: Exception "
                                + eRef.toString());        //Line 14
          else if (eRef instanceof InputMismatchException) //Line 15
              System.out.println("Line 16: Exception "
                                + eRef.toString());        //Line 16
      }
   }
}


