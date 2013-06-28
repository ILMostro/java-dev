//Effect of break statements in a switch structure

import java.util.*;

public class BreakStatementsInSwitch
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int num;

        System.out.print("Enter an integer between "
                       + "0 and 10: ");              //Line 1
        num = console.nextInt();                     //Line 2
        System.out.println();                        //Line 3

        System.out.println("The number you entered "
                         + "is " + num);             //Line 4

        switch (num)                                 //Line 5
        {
        case 0:                                      //Line 6
        case 1:                                      //Line 7
            System.out.print("Hello ");              //Line 8
        case 2:                                      //Line 9
            System.out.print("there. ");             //Line 10
        case 3:                                      //Line 11
            System.out.print("I am ");               //Line 12
        case 4:                                      //Line 13
            System.out.println("Mickey.");           //Line 14
            break;                                   //Line 15

        case 5:                                      //Line 16
            System.out.print("How ");                //Line 17
        case 6:                                      //Line 18
        case 7:                                      //Line 19
        case 8:                                      //Line 20
             System.out.println("are you?");         //Line 21
             break;                                  //Line 22

        case 9:                                      //Line 23
            break;                                   //Line 24

        case 10:                                     //Line 25
            System.out.println("Have a nice day.");  //Line 26
            break;                                   //Line 27
        default:                                     //Line 28
            System.out.println("Sorry the number is "
                             + "out of range.");     //Line 29
        }

        System.out.println("Out of switch "
                         + "structure.");            //Line 30
    }
}


