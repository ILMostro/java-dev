
public class StringObjectsAndTheOprNew
{
    public static void main(String[] args)
    {
        String str1 = "Hello";                          //Line 1
        String str2 = "Hello";                          //Line 2
        String str3 = new String("Hello");              //Line 3
        String str4 = new String("Hello");              //Line 4

        if (str1 == str2)                               //Line 5
            System.out.println("Line 6: Both str1 and "
                             + "str2 point to the "
                             + "same string object.");  //Line 6
        else                                            //Line 7
            System.out.println("Line 8: str1 and str2 "
                             + "do not point to the "
                             + "same string object.");  //Line 8

        if (str1.equals(str2))                          //Line 9
            System.out.println("Line 9: The values of "
                             + "the String objects "
                             + "str1 and str2 point\n"
                             + "        to are the "
                             + "same.");                //Line 10
        else                                            //Line 11
            System.out.println("Line 8: The values of "
                             + "the String objects "
                             + "str1 and str2 point\n"
                             + "        to are not "
                             + "the same.");            //Line 12

        if (str3 == str4)                               //Line 13
            System.out.println("Line 14: Both str3 and "
                             + "str4 points to the "
                             + "same string object.");  //Line 14
        else                                            //Line 15
            System.out.println("Line 16: str3 and str4 "
                             + "do not point to the "
                             + "same string object.");  //Line 16

        if (str3.equals(str4))                          //Line 17
            System.out.println("Line 18: The values of "
                             + "the String objects "
                             + "str3 and str4 point\n"
                             + "         to are the "
                             + "same.");                //Line 18
        else                                            //Line 19
            System.out.println("Line 20: The values of "
                             + "the String objects "
                             + "str3 and str4 point\n"
                             + "         to are not "
                             + "the same.");            //Line 20

        if (str1 == str3)                               //Line 21
            System.out.println("Line 22: Both str1 and "
                             + "str3 points to the "
                             + "same string object.");  //Line 22
        else                                            //Line 23
            System.out.println("Line 24: str1 and str3 "
                             + "do not point to the "
                             + "same string object.");  //Line 24

        if (str1.equals(str3))                          //Line 25
            System.out.println("Line 26: The values of "
                             + "the String objects "
                             + "str1 and str3 point\n"
                             + "         to are the "
                             + "same.");                //Line 26
        else                                            //Line 27
            System.out.println("Line 28: The values of "
                             + "the String objects "
                             + "str1 and str3 point\n"
                             + "         to are not"
                             + "the same.");            //Line 28
    }
}
