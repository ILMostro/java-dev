
// This program illustrates how two-dimensional arrays are
// passed as parameters to methods.

public class TwoDimArraysAsParam                      //Line 1
{                                                     //Line 2
    public static void main(String[] args)            //Line 3
    {                                                 //Line 4
        int[][] board ={{23,5,6,15,18},
                        {4,16,24,67,10},
                        {12,54,23,76,11},
                        {1,12,34,22,8},
                        {81,54,32,67,33},
                        {12,34,76,78,9}};             //Line 5

        TwoDimArraysMethods.printMatrix(board);       //Line 6
        System.out.println();                         //Line 7

        TwoDimArraysMethods.sumRows(board);           //Line 8
        System.out.println();                         //Line 9

        TwoDimArraysMethods.largestInRows(board);     //Line 10
    } //end main                                      //Line 11
}                                                     //Line 12
