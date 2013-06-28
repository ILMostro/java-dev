
public class Chapter7_PrimitiveTypesAsObjects
{
    public static void main(String[] args)
    {
        int num1;                                     //Line 1

        IntClass num2 = new IntClass();               //Line 2

        char ch;                                      //Line 3

        StringBuffer str;                             //Line 4

        num1 = 10;                                    //Line 5
        num2.setNum(15);                              //Line 6
        ch = 'A';                                     //Line 7
        str = new StringBuffer("Sunny");              //Line 8

        System.out.println("Line 9: Inside main: "
                           + "num1 = " + num1
                           + ", num2 = " + num2.getNum()
                           + ", ch = " + ch
                           + ", and str = "
                           + str);                    //Line 9


        funcOne(num1, num2, ch, str);                 //Line 10

        System.out.println("Line 11: After funcOne: "
                           + "num1 = " + num1
                           + ", num2 = " + num2.getNum()
                           + ", ch = " + ch
                           + ", and str = "
                           + str);                    //Line 11
    }

   public static void funcOne(int a, IntClass b,
                             char v, StringBuffer pStr)
    {
        int num;                                      //Line 12
        int len;                                      //Line 13

        num = b.getNum();                             //Line 14
        a++;                                          //Line 15
        b.addToNum(12);                               //Line 16
        v = 'B';                                      //Line 17

        len = pStr.length();                          //Line 18
        pStr.delete(0, len);                          //Line 19
        pStr.append("Warm");                          //Line 20

        System.out.println("Line 21: Inside funcOne: \n"
                         + "         a = " + a
                         + ", b = " + b.getNum()
                         + ", v = " + v
                         + ", pStr = " + pStr
                         + ", len = " + len
                         + ", and num = " + num);     //Line 21
    }
}
