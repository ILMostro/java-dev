
public class IntegerObjectsAndTheOprNew
{
    public static void main(String[] args)
    {
        Integer num1 = 25;                              //Line 1
        Integer num2 = 25;                              //Line 2
        Integer num3 = new Integer(25);                 //Line 3
        Integer num4 = new Integer(25);                 //Line 4

        if (num1 == num2)                               //Line 5
            System.out.println("Line 6: Both num1 and "
                             + "num2 point to the "
                             + "same Integer object."); //Line 6
        else                                            //Line 7
            System.out.println("Line 8: num1 and num2 "
                             + "do not point to the "
                             + "same Integer object."); //Line 8

        if (num1.equals(num2))                          //Line 9
            System.out.println("Line 9: The values of "
                             + "the Integer objects "
                             + "num1 and num2 point\n"
                             + "        to are the "
                             + "same.");                //Line 10
        else                                            //Line 11
            System.out.println("Line 8: The values of "
                             + "the Integer objects "
                             + "num1 and num2 point\n"
                             + "        to are not "
                             + "the same.");            //Line 12

        if (num3 == num4)                               //Line 13
            System.out.println("Line 14: Both num3 and "
                             + "num4 points to the "
                             + "same Integer object."); //Line 14
        else                                            //Line 15
            System.out.println("Line 16: num3 and num4 "
                             + "do not point to the "
                             + "same Integer object."); //Line 16

        if (num3.equals(num4))                          //Line 17
            System.out.println("Line 18: The values of "
                             + "the Integer objects "
                             + "num3 and num4 point\n"
                             + "         to are the "
                             + "same.");                //Line 18
        else                                            //Line 19
            System.out.println("Line 20: The values of "
                             + "the Integer objects "
                             + "num3 and num4 point\n"
                             + "         to are not "
                             + "the same.");            //Line 20

        if (num1 == num3)                               //Line 21
            System.out.println("Line 22: Both num1 and "
                             + "num3 points to the "
                             + "same Integer object."); //Line 22
        else                                            //Line 23
            System.out.println("Line 24: num1 and num3 "
                             + "do not point to the "
                             + "same Integer object."); //Line 24

        if (num1.equals(num3))                          //Line 25
            System.out.println("Line 26: The values of "
                             + "the Integer objects "
                             + "num1 and num3 point\n"
                             + "         to are the "
                             + "same.");                //Line 26
        else                                            //Line 27
            System.out.println("Line 28: The values of "
                             + "the Integer objects "
                             + "num1 and num3 point\n"
                             + "         to are not"
                             + "the same.");            //Line 28
    }
}
