
public class FormattingOutputWithprintf
{
    public static void main(String[] args)
    {
        int num = 763;                               //Line 1

        double x = 658.75;                           //Line 2

        String str = "Java Program.";                //Line 3

        System.out.println("1234567890123456789"
                         + "01234567890");           //Line 4
        System.out.printf("%5d%7.2f%15s%n",
                           num, x, str);             //Line 5
        System.out.printf("%15s%6d%9.2f%n",
                           str, num, x);             //Line 6
        System.out.printf("%8.2f%7d%15s%n",
                           x, num, str);             //Line 7

        System.out.printf("num = %5d%n", num);       //Line 8
        System.out.printf("x = %10.2f%n", x);        //Line 9
        System.out.printf("str = %15s%n", str);      //Line 10
        System.out.printf("%10s%7d%n",
                          "Program No.", 4);         //Line 11
    }
}
