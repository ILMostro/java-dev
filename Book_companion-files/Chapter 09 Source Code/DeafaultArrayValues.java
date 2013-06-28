
public class DeafaultArrayValues
{
    public static void main(String[] args)
    {
        int[] intArray = new int[5];
        char[] charArray = new char[5];
        boolean[] booleanArray = new boolean[5];

        for (int i = 0; i < 5; i++)
            System.out.print(intArray[i] + " ");
        System.out.println();

        for (int i = 0; i < 5; i++)
             System.out.print("*" + charArray[i] + "*, ");
        System.out.println();

        for (int i = 0; i < 5; i++)
              System.out.print(booleanArray[i] + " ");
        System.out.println();

        System.out.println("*" + (int) '\u0010' + "*");

        System.out.println(charArray[0] == '\u0000');

        for (int i = 0; i < 128; i++)
            System.out.print((char) i + " ");
        System.out.println();

        for (int i = 0; i < 10000; i++)
            System.out.print((char) 8 + " ********* ");
        System.out.println();
    }
}