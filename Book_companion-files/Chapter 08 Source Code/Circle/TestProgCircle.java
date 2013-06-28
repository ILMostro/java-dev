
// Program to test various operations of the class Circle.

import java.util.*;                                      //Line 1


public class TestProgCircle                              //Line 2
{                                                        //Line 3
    static Scanner console = new Scanner(System.in);     //Line 4

    public static void main(String[] args)               //Line 5
    {                                                    //Line 6
        Circle firstCircle = new Circle();               //Line 7
        Circle secondCircle = new Circle(12);            //Line 8

        double radius;                                   //Line 9

        System.out.println("Line 10: firstCircle: "
                          + firstCircle);                //Line 10

        System.out.println("Line 11: secondCircle: "
                          + secondCircle);               //Line 11

        System.out.print("Line 12: Enter the radius: "); //Line 12
        radius = console.nextDouble();                   //Line 13
        System.out.println();                            //Line 14

        firstCircle.setRadius(radius);                   //Line 15

        System.out.println("Line 16: firstCircle: "
                        + firstCircle );                 //Line 16

        if (firstCircle.getRadius()
                   > secondCircle.getRadius())           //Line 17
            System.out.println("Line 18: The radius of "
                 + "the first circle is greater than "
                 + "the radius of the second circle. "); //Line 18
        else if (firstCircle.getRadius()
                    < secondCircle.getRadius())          //Line 19
            System.out.println("Line 20: The radius of "
                 + "the first circle is less than the "
                 + "radius of the second circle. ");     //Line 20
        else                                             //Line 21
            System.out.println("Line 22: The radius of "
                 + "both the circles are the same.");    //Line 22
    }//end main                                          //Line 23
}                                                        //Line 24
