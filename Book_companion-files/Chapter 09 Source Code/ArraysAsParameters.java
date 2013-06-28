
// This program illustrates how arrays are passed as parameters
// to methods.

import java.util.*;                                      //Line 1

public class ArraysAsParameters                          //Line 2
{                                                        //Line 3
    static final int ARRAY_SIZE = 10;                    //Line 4

    public static void main(String[] args)               //Line 5
    {                                                    //Line 6
        int[] listA = new int[ARRAY_SIZE];               //Line 7
        int[] listB = new int[ARRAY_SIZE];               //Line 8

        System.out.print("Line 9: listA elements: ");    //Line 9

            //output the elements of listA using
            //the method printArray
        OneDimArrayMethods.printArray(listA,
                                      listA.length);     //Line 10
        System.out.println();                            //Line 11

        System.out.print("Line 12: Enter " + listA.length
                       + " integers: ");                 //Line 12

            //input data into listA using the method fillArray
        OneDimArrayMethods.fillArray(listA,
                                     listA.length);      //Line 13
        System.out.println();                            //Line 14

        System.out.print("Line 15: After filling "
                       + "listA, the elements are:"
                       + "\n        ");                  //Line 15

            //output the elements of listA
        OneDimArrayMethods.printArray(listA,
                                      listA.length);     //Line 16
        System.out.println();                            //Line 17

            //find and output the sum of the elements of listA
        System.out.println("Line 18: The sum of the "
                    + "elements of listA is: "
                    + OneDimArrayMethods.sumArray(listA,
                                      listA.length));    //Line 18

            //find and output the position of the (first)
            //largest element in listA
        System.out.println("Line 19: The position of "
                 + "the largest element in "
                 + "listA is: "
                 + OneDimArrayMethods.indexLargestElement
                             (listA, listA.length));     //Line 19

             //find and output the largest element in listA
        System.out.println("Line 20: The largest element "
            + "in listA is: "
            + listA[OneDimArrayMethods.indexLargestElement
                               (listA, listA.length)]);  //Line 20

             //copy the elements of listA into listB
             //using the method copyArray
        OneDimArrayMethods.copyArray(listA, 0, listB, 0,
                                     listA.length);      //Line 21
        System.out.print("Line 22: After copying the "
                   + "elements of listA into listB\n"
                   + "         listB elements are: ");   //Line 22

             //output the elements of listB
        OneDimArrayMethods.printArray(listB,
                                      listB.length);     //Line 23
        System.out.println();                            //Line 24
    } //end main                                         //Line 25
}
