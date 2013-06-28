// This program illustrates how to use a sequential search in a
// program.

import java.util.*;                                       //Line 1

public class TestSeqSearch                                //Line 2
{                                                         //Line 3
    static Scanner console = new Scanner(System.in);      //Line 4

    public static void main(String[] args)                //Line 5
    {                                                     //Line 6
        int[] intList = new int[10];                      //Line 7
        int number;                                       //Line 8
        int index;                                        //Line 9

        System.out.println("Line 10: Enter "
                       + intList.length + " integers.");  //Line 10

        for (index  = 0; index < intList.length; index++) //Line 11
            intList[index] = console.nextInt();           //Line 12

        System.out.println();                             //Line 13

        System.out.print("Line 14: Enter the number "
                       + "to be searched: ");             //Line 14
        number  = console.nextInt();                      //Line 15
        System.out.println();                             //Line 16

        index = OneDimArrayMethods.seqSearch(intList,
                               intList.length, number);   //Line 17

        if (index != -1)                                  //Line 18
            System.out.println("Line 19: " + number
                             + " is found at position "
                             + index);                    //Line 19
        else                                              //Line 20
            System.out.println("Line 21: " + number
                           + " is not in the list.");     //Line 21
    }                                                     //Line 22
}                                                         //Line 23
