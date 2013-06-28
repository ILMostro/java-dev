
//*************************************************************
// Author: D. S. Malik
//
// Program: Code Detection
// This program checks whether the message received at the
// destination is error-free. If there is an error in the
// message, then the program outputs an error message and
// asks for retransmission.
//**************************************************************

import java.util.*;

public class CodeDetection
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int codeLength;                         //Step 1

        System.out.print("Enter the length of "
                       + " the code: ");        //Step 2
        codeLength = console.nextInt();         //Step 3
        System.out.println();

        int[] codeArray = new int[codeLength];  //Step 4

        readCode(codeArray);                    //Step 5
        compareCode(codeArray);                 //Step 6
    }

    public static void readCode(int[] list)
    {
        System.out.print("Enter the secret code: ");

        for (int count = 0; count < list.length; count++)
            list[count] = console.nextInt();

        System.out.println();
    }

    public static void compareCode(int[] list)
    {
            //Step a: Declare the variables
        int length2;
        int digit;
        boolean codeOk;
        int count;

        codeOk = true;                              //Step b

        System.out.println("Enter the length of the copy of "
                         + "the secret code \nand a copy of "
                         + "the secret code: ");

        length2 = console.nextInt();                //Step c

        if (list.length != length2)                 //Step d
        {
            System.out.println("The original code and "
                             + "its copy are not of "
                             + "the same length.");
            return;
        }

        System.out.println("Code Digit   Code Digit "
                        +  "Copy");                 //Step e

        for (count = 0; count < list.length; count++) //Step f
        {
            digit = console.nextInt();              //Step f.1

            System.out.printf("%5d %15d",
                              list[count], digit);  //Step f.2

            if (digit != list[count])               //Step f.3
            {
                System.out.println("  corresponding code "
                                 + "digits not the same");
                codeOk = false;
            }
            else
                System.out.println();
        }

        if (codeOk)                                 //Step g
            System.out.println("Message transmitted OK.");
        else
           System.out.println("Error in transmission. "
                            + "Retransmit!!");
    }
}
