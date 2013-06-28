//Program: Largest of a set of numbers
//This program is the same as LargestVersion. Here we use
//a foreach loop to find the largest number.

import java.util.*;

public class LargestNumberVersionII
{
    public static void main(String[] args)
    {
        double[] numberList = {23, 45.5, 89, 34, 92.78,
                               36, 90, 120.89, 97, 23,
                               90, 89};                //Line 1

        System.out.println("Line 2: The larger of 5.6 "
                         + "and 10.8 is "
                         + largest(5.6, 10.8));        //Line 2

        System.out.println("Line 3: The largest of 23, "
                         + "78, and 56 is "
                         + largest(23, 78, 56));       //Line 3

        System.out.println("Line 4: The largest of 93, "
                         + "28, 83, and 66 is "
                         + largest(93, 28, 83, 66));   //Line 4

        System.out.println("Line 5: The largest of 22.5, "
                         + "12.34, 56.34, 78, "
                         + "\n        "
                         + "98.45, 25, 78, 23 and 36 is "
                         + largest(22.5, 12.34, 56.34,
                                   78, 98.45, 25, 78,
                                   23, 36));           //Line 5

        System.out.println("Line 6: The largest "
                         + "number in numList is "
                         + largest(numberList));       //Line 6

        System.out.println("Line 7: A call to the method "
                         + "largest with an empty \n"
                         + "        parameter "
                         + "list returns the value "
                         + largest());                 //Line 7
    }

    public static double largest(double ... numList)
    {
        double max = 0;

        if (numList.length != 0)
	    {
            max = numList[0];

            for (double num : numList)
		    {
		        if (max < num)
		            max = num;
		    }

            return max;
	    }

	    return 0;
    }
}

