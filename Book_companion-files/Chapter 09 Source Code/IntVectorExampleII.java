
import java.util.Vector;

public class IntVectorExampleII
{
    public static void main(String[] arg)
    {
        Vector<Integer> intList = new Vector<Integer>(20);

        Integer num;

            //add numbers in intList
        for (int i = 0; i < 10; i++)
        {
            num = i + 5;

           	intList.insertElementAt(num, i);
        }

        intList.addElement(82);      //add 82 at the end

        System.out.println("intList: " + intList);

            //The following foreach loop outputs the numbers in
            //intList after multiplying each number with 2
        for (int x : intList)
            System.out.print( 2 * x + " ");

        System.out.println();
    }
}
