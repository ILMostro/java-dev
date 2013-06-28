import java.io.*;
import java.util.*;

public class LoopWithBugsData1
{
    public static void main(String[] args)
                           throws FileNotFoundException
    {
        int i;
        int j;
        int sum;
        int num;

        Scanner infile =
            new Scanner(new FileReader("Ch5_LoopWithBugsData.txt"));

        for (i = 1; i <= 4; i++)
        {
            sum = 0;

            for (j = 1; j <= 4; j++)
            {
                num = infile.nextInt();
                System.out.print(num + " ");
                sum = sum + num;
            }

            System.out.println("sum = " + sum);
        }
    }
}
