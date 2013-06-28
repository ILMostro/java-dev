
import java.util.*;                                      //Line 1

public class LogicError1                                 //Line 2
{                                                        //Line 3
    static Scanner console = new Scanner(System.in);     //Line 4

    public static void main(String[] args)               //Line 5
    {                                                    //Line 4
        int fahrenheit;                                  //Line 6
        int celsius;                                     //Line 7

        System.out.print("Enter temperature in "
                       + "Fahrenheit: ");                //Line 8
        fahrenheit = console.nextInt();                  //Line 9
        System.out.println();                            //Line 10

        celsius = 5 / 9 * (fahrenheit - 32);             //Line 11

        System.out.println(fahrenheit + " degree F = "
                         + celsius + " degree C.");      //Line 12
    }                                                    //Line 13
}                                                        //Line 14



