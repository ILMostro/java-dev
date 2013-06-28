
//Grade program with bugs.

import java.util.*;                                     //Line 1

public class BugInSwitch                                //Line 2
{                                                       //Line 3
    static Scanner console = new Scanner(System.in);    //Line 4

    public static void main(String[] args)              //Line 5
    {                                                   //Line 6
        int testScore;                                  //Line 7

        System.out.print("Enter the test score: ");     //Line 8
        testScore = console.nextInt();                  //Line 9
        System.out.println();                           //Line 10

        switch (testScore / 10)                         //Line 11
        {                                               //Line 12
        case 0:                                         //Line 13
        case 1:                                         //Line 14
        case 2:                                         //Line 15
        case 3:                                         //Line 16
        case 4:                                         //Line 17
        case 5:                                         //Line 18
            System.out.println("The grade is F.");      //Line 19
        case 6:                                         //Line 20
            System.out.println("The grade is D.");      //Line 21
        case 7:                                         //Line 22
            System.out.println("The grade is C.");      //LIne 23
        case 8:                                         //Line 24
            System.out.println("The grade is B.");      //Line 25
        case 9:                                         //Line 26
        case 10:                                        //Line 27
            System.out.println("The grade is A.");      //Line 28
        default:                                        //Line 29
            System.out.println("Invalid test score.");  //Line 30
        }                                               //Line 31
    }                                                   //Line 32
}                                                       //Line 33
