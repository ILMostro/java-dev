// This program illustrates how to use a selection sort algorithm
// in a program.

public class TestSelectionSort                      //Line 1
{                                                   //Line 2
    public static void main(String[] args)          //Line 3
    {
        int list[] = {2, 56, 34, 25, 73, 46, 89,
                      10, 5, 16};                   //Line 4

        selectionSort(list, list.length);           //Line 5

        System.out.println("After sorting, the "
                         + "list elements are:");   //Line 6

        for (int i = 0; i < list.length; i++)       //Line 7
            System.out.print(list[i] + " ");        //Line 8

        System.out.println();                       //Line 9
    }                                               //Line 10

    public static void selectionSort(int[] list, int listLength)
    {
        int index;
        int smallestIndex;
        int minIndex;
        int temp;

        for (index = 0; index < listLength - 1; index++)
        {
                //Step a
            smallestIndex = index;

            for (minIndex = index + 1; minIndex < listLength;
                                       minIndex++)
                if (list[minIndex] < list[smallestIndex])
                    smallestIndex = minIndex;

                //Step b
            temp = list[smallestIndex];
            list[smallestIndex] = list[index];
            list[index] = temp;
        }
    }
}
