
import java.util.*;

public class Example2_18
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int firstNum;
        int secondNum;
        char ch;
        double z;

        firstNum = 4;                                          //Line 1

        System.out.println("Line 2: firstNum = "
                          + firstNum);                         //Line 2

        secondNum = 2 * firstNum + 6;                          //Line 3

        System.out.println("Line 4: firstNum = " + firstNum
                         + ", secondNum = " + secondNum);      //Line 4

        z = (firstNum + 1) / 2.0;                              //Line 5

        System.out.println("Line 6: firstNum = " + firstNum
                         + ", secondNum = " + secondNum
                         + ", z = " + z);                      //Line 6

        ch = 'A';                                              //Line 7

        System.out.println("Line 8: firstNum = " + firstNum
                         + ", secondNum = " + secondNum
                         + ", ch = " + ch
                         + ", z = " + z);                      //Line 8

        secondNum = console.nextInt();                         //Line 9

        System.out.println("Line 10: firstNum = " + firstNum
                         + ", secondNum = " + secondNum
                         + ", ch = " + ch
                         + ", z = " + z);                      //Line 10

        z = console.nextDouble();                              //Line 11
        System.out.println("Line 12: firstNum = " + firstNum
                         + ", secondNum = " + secondNum
                         + ", ch = " + ch
                         + ", z = " + z);                      //Line 12

        firstNum = (int)(z) + 8;                               //Line 13

        System.out.println("Line 14: firstNum = " + firstNum
                         + ", secondNum = " + secondNum
                         + ", ch = " + ch
                         + ", z = " + z);                      //Line 14

        secondNum = secondNum + 1;                             //Line 15

        System.out.println("Line 16: firstNum = " + firstNum
                         + ", secondNum = " + secondNum
                         + ", ch = " + ch
                         + ", z = " + z);                      //Line 16

        ch = console.next().charAt(0);                         //Line 17

        System.out.println("Line 18: firstNum = " + firstNum
                         + ", secondNum = " + secondNum
                         + ", ch = " + ch
                         + ", z = " + z);                      //Line 18

        firstNum = firstNum + (int)(ch);                       //Line 19

        System.out.println("Line 20: firstNum = " + firstNum
                         + ", secondNum = " + secondNum
                         + ", ch = " + ch
                         + ", z = " + z);                      //Line 20
    }
}

