public class TestBubbleSort
{
    public static void main(String[] args)
    {
        int list[] = {2, 56, 34, 25, 73, 46, 89,
                      10, 5, 16};                   //Line 1
        int i;                                      //Line 2

        bubbleSort(list, 10);                       //Line 3

        System.out.println("After sorting, the "
                         + "list elements are:");   //Line 4

        for (i = 0; i < 10; i++)                    //Line 5
            System.out.print(list[i] + " ");        //Line 6

        System.out.println();                       //Line 7
    }

    public static void bubbleSort(int list[], int listLength)
    {
        int temp;
        int counter, index;

        for (counter = 0; counter < listLength - 1; counter++)
        {
            for (index = 0; index < listLength - 1 - counter;
                            index++)
                if (list[index] > list[index + 1])
                {
                    temp = list[index];
                    list[index] = list[index + 1];
                    list[index + 1] = temp;
                }
        }
    }
}
