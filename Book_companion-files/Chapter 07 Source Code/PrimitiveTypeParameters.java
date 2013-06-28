

// Example 7-8
// Program illustrating how a formal parameter of a primitive data
// type works.

public class PrimitiveTypeParameters                   //Line 1
{                                                      //Line 2
    public static void main(String[] args)             //Line 3
    {                                                  //Line 4
        int number = 6;                                //Line 5

        System.out.println("Line 6: Before calling"
                         + "the method "
                         + "primFormalParam, "
                         + "number = " + number);      //Line 6

        primFormalParam(number);                       //Line 7

        System.out.println("Line 8: After calling "
                         + "the method "
                         + "primFormalParam, "
                         + "number = " + number);      //Line 8
    } //end main                                       //Line 9

    public static void primFormalParam(int num)        //Line 10
    {                                                  //Line 11
        System.out.println("Line 12: In the method "
                         + "primFormalParam, "
                         + "before changing, num = "
                         + num);                       //Line 12

        num = 15;                                      //Line 13

        System.out.println("Line 14: In the method "
                         + "primFormalParam, "
                         + "after changing, num = "
                         + num);                       //Line 14
    } //end primFormalParam                            //Line 15
}                                                      //Line 16
