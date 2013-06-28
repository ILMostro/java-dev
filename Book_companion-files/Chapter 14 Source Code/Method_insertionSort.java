public static void insertionSort(int[] list, int listLength)
{
    int firstOutOfOrder, location;
    int temp;

    for (firstOutOfOrder = 1; firstOutOfOrder < listLength;
                              firstOutOfOrder++)
    if (list[firstOutOfOrder] < list[firstOutOfOrder - 1])
    {
        temp = list[firstOutOfOrder];
        location = firstOutOfOrder;

        do
        {
            list[location] = list[location - 1];
            location--;
        }
        while (location > 0 && list[location - 1] > temp);

        list[location] = temp;
    }
} //end insertionSort
