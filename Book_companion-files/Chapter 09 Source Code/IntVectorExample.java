
import java.util.Vector;

public class IntVectorExample
{
    public static void main(String[] arg)
    {
        Vector<Integer> intList = new Vector<Integer>(20);
        Integer num;

        System.out.println("Empty: " + intList.isEmpty());

        System.out.println("Size: " + intList.size());
        System.out.println("Capacity: " + intList.capacity());

        for (int i = 0; i < 10; i++)
        {
            num = i + 5;

           	intList.insertElementAt(num, i);
        }

        intList.addElement(75);

        intList.addElement(new Integer(78));

        for (int i = 0; i < 11; i++)
        {
            num = (Integer) intList.elementAt(i);
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("Empty: " + intList.isEmpty());

        num = 75;

        System.out.println(intList.contains(num));

        intList.set(4, num);

        System.out.println(intList.toString());

        System.out.println("Length: " + intList.size());
        System.out.println("Capacity: " + intList.capacity());

        intList.trimToSize();

        System.out.println("Length: " + intList.size());
    }
}
