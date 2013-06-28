
//RethrowExceptionExmp1

import java.util.*;

public class RethrowExceptionExmp1
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)            //Line 1
    {
        int number;                                   //Line 2

        try                                           //Line 3
        {
            number = getNumber();                     //Line 4
            System.out.println("Line 5: number = "
                              + number);              //Line 5
        }
        catch (InputMismatchException imeRef)         //Line 6
        {
            System.out.println("Line 7: Exception "
                              + imeRef.toString());   //Line 7
        }
    }

    public static int getNumber()
                  throws InputMismatchException       //Line 8
    {
        int num;                                      //Line 9

        try                                           //Line 10
        {
            System.out.print("Line 11: Enter an "
                            + "integer: ");           //Line 11
            num = console.nextInt();                  //Line 12
            System.out.println();                     //Line 13

            return num;                               //Line 14
        }
        catch (InputMismatchException imeRef)         //Line 15
        {
            throw imeRef;                             //Line 16
        }
    }
}

