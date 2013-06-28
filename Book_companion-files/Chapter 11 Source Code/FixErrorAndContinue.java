
import java.util.*;

public class FixErrorAndContinue
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int number;                                   //Line 1
        boolean done;                                 //Line 2
        String str;                                   //Line 3

        done = false;                                 //Line 4

        do                                            //Line 5
        {
            try                                       //Line 6
            {
                System.out.print("Line 7: Enter an "
                               + "integer: ");        //Line 7
                number = console.nextInt();           //Line 8
                System.out.println();                 //Line 9
                done = true;                          //Line 10

                System.out.println("Line 11: number = "
                                  + number);          //Line 11
            }
            catch (InputMismatchException imeRef)     //Line 12
            {
                str = console.next();                 //Line 13

                System.out.println("Line 14: Exception "
                                  + imeRef.toString()
                                  + " " + str);       //Line 14
            }
        }
        while (!done);                                //Line 15
    }
}


