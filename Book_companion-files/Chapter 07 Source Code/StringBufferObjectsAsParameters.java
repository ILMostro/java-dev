
// This program illustrates how StringBuffer objects as
// parameters work.

public class StringBufferObjectsAsParameters           //Line 1
{                                                      //Line 2
    public static void main(String[] args)             //Line 3
    {                                                  //Line 4
        StringBuffer str = new StringBuffer("Hello");  //Line 5

        System.out.println("Line 6: str before "
                         + "calling the method "
                         + "stringBufferParameter: "
                         + str);                       //Line 6

        stringBufferParameter(str);                    //Line 7

        System.out.println("Line 8: str after "
                         + "calling the method "
                         + "stringBufferParameter: "
                         + str);                       //Line 8
    } //end main                                       //Line 9

    public static void stringBufferParameter
                                (StringBuffer pStr)    //Line 10
    {                                                  //Line 11
       System.out.println("Line 12: In the method "
                        + "stringBufferParameter ");   //Line 12
       System.out.println("Line 13: pStr before "
                        + "changing its value: "
                        + pStr);                       //Line 13

       pStr.append(" There");                          //Line 14

       System.out.println("Line 15: pStr after "
                        + "changing its value: "
                        + pStr);                       //Line 15
    } //end stringBufferParameter                      //Line 16
}                                                      //Line 17
