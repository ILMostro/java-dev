
// This class contains methods to process elements in two-
// dimensional arrays.

public class TwoDimArraysMethods
{
    public static void printMatrix(int[][] matrix)
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[row].length; col++)
                System.out.printf("%7d", matrix[row][col]);

            System.out.println();
        }
    } //end printMatrix

    public static void sumRows(int[][] matrix)
    {
        int sum;

            //sum of each individual row
        for (int row = 0; row < matrix.length; row++)
        {
            sum = 0;

            for (int col = 0; col < matrix[row].length; col++)
                 sum = sum + matrix[row][col];

            System.out.println("The sum of the elements of row "
                             + (row + 1) + " = " + sum + ".");
        }
    } //end sumRows

    public static void largestInRows(int[][] matrix)
    {
        int largest;

            //Largest element in each row
        for (int row = 0; row < matrix.length; row++)
        {
            largest = matrix[row][0]; //assume that the first
                                      //element of the row is
                                      //largest
            for (int col = 1; col < matrix[row].length; col++)
                if (largest < matrix[row][col])
                    largest = matrix[row][col];

            System.out.println("The largest element of row "
                             + (row + 1) + " = " + largest + ".");
        }
    } //end largestInRows
}
