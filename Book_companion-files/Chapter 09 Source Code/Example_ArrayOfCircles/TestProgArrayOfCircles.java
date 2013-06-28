
// Program to create an array of circles.

import java.util.*;                                      //Line 1

public class TestProgArrayOfCircles                      //Line 2
{                                                        //Line 3
    static Scanner console = new Scanner(System.in);     //Line 4

    public static void main(String[] args)               //Line 5
    {                                                    //Line 6
        Circle[] circles = new Circle[5];                //Line 7

        double radius;                                   //Line 8

        for (int i = 0; i < 5; i++)                      //Line 9
        {                                                //Line 10
            System.out.print("Enter the radius of circle "
                          + (i + 1) + ": ");             //Line 11
            radius = console.nextDouble();               //Line 12
            circles[i] = new Circle(radius);             //Line 13
            System.out.println();                        //Line 14
        }                                                //Line 15

        for (int i = 0; i < 5; i++)                      //Line 16
            System.out.printf("Circle " + (i + 1) + ": "
                             + circles[i]);              //Line 17
    }//end main                                          //Line 18
}                                                        //Line 19

