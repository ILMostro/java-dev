
import java.io.*;
import java.util.*;

public class Example5_7B
{

    public static void main(String[] args) throws IOException
    {
        int num;

        int sum = 0;

        Scanner inFile = new Scanner(new FileReader("numData.txt"));

        while (inFile.hasNext())
        {
			num = inFile.nextInt();
            sum = sum + num;
        }//end while

        System.out.println("Sum = " + sum);
    }
}
