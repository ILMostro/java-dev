
// This class contains methods to manipulate data in a
// one-dimensional array.

import java.util.*;

public class OneDimArrayMethods
{
       //Method to input data and store in an int array.
       //The array to store the data and its size are passed as
       //parameters. The parameter numOfElements specifies the
       //number of elements to be read.
    public static void fillArray(int[] list, int numOfElements)
    {
        Scanner console = new Scanner(System.in);

        for (int index = 0; index < numOfElements; index++)
            list[index] = console.nextInt();
    }

       //Method to print the elements of an int array.
       //The array to be printed and the number of elements are
       //passed as parameters. The parameter numOfElements
       //specifies the number of elements to be printed.
    public static void printArray(int[] list, int numOfElements)
    {
        for (int index = 0; index < numOfElements; index++)
            System.out.print(list[index] + " ");
    }

       //Method to find and return the sum of the elements of an
       //int array. The parameter numOfElements specifies the
       //number of elements to be added.
    public static int sumArray(int[] list, int numOfElements)
    {
        int sum = 0;

        for (int index = 0; index < numOfElements; index++)
             sum = sum + list[index];

        return sum;
    }

       //Method to find and return the index of the first occurrence
       //of the largest element, if it repeats, in an int array.
       //The parameter numOfElements specifies the number of
       //elements in the array.
    public static int indexLargestElement(int[] list,
                                          int numOfElements)
    {
        int maxIndex = 0; //Assume first element is the largest

        for (int index = 1; index < numOfElements; index++)
             if (list[maxIndex] < list[index])
                 maxIndex = index;

         return maxIndex;
    }

       //Method to copy some or all the elements of one array
       //into another array. Starting at the position specified
       //by src, the  elements of list1 are copied into list2
       //starting at the position specified by tar. The parameter
       //numOfElements specifies the number of elements of list1 to
       //be copied into list2. Starting at the position specified
       //by tar, the list2 must have enough components to copy the
       //elements of list1. The following call copies all the
       //elements of list1 into the corresponding positions in
       //list2:  copyArray(list1, 0, list2, 0, numOfElements);.
    public static void copyArray(int[] list1, int src, int[] list2,
                                 int tar, int numOfElements)
    {
        for (int index = src; index < src + numOfElements; index++)
        {
            list2[index] = list1[tar];
            tar++;
        }
    }
}
