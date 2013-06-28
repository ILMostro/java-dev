
//*****************************************************************
// Author: D.S. Malik
//
// This program shows where the import statements, named constants,
// variable declarations, assignment statements, and input and
// output statements typically appear.
//*****************************************************************

import java.util.*;                                       //Line 1

public class FirstJavaProgram                             //Line 2
{                                                         //Line 3
    static final int NUMBER = 12;                         //Line 4

    static Scanner console = new Scanner(System.in);      //Line 5

    public static void main(String[] args)                //Line 6
    {                                                     //Line 7
        int firstNum;                                     //Line 8
        int secondNum;                                    //Line 9

        firstNum = 18;                                    //Line 10
        System.out.println("Line 11: firstNum = "
                          + firstNum);                    //Line 11

        System.out.print("Line 12: Enter an integer: ");  //Line 12
        secondNum = console.nextInt();                    //Line 13
        System.out.println();                             //Line 14

        System.out.println("Line 15: secondNum = "
                          + secondNum);                   //Line 15

        firstNum = firstNum + NUMBER + 2 * secondNum;     //Line 16

        System.out.println("Line 17: The new value of " +
                           "firstNum = " + firstNum);     //Line 17
     }                                                    //Line 18
}                                                         //Line 19
