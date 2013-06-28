

//GPA program with bugs.

import java.util.*;                                        //Line 1

public class GPABugProgCorrect                             //Line 2
{                                                          //Line 3
    static Scanner console = new Scanner(System.in);       //Line 4

    public static void main(String[] args)                 //Line 5
    {                                                      //Line 6
        double gpa;                                        //Line 7

        System.out.print("Enter the GPA: ");               //Line 8
        gpa = console.nextDouble();                        //Line 9
        System.out.println();                              //Line 10

        if (gpa >= 2.0)                                    //Line 11
        {                                                  //Line 12
            if (gpa >= 3.9)                                //Line 13
                System.out.println("Dean\'s Honor List."); //Line 14
        }                                                  //Line 15
        else                                               //Line 16
            System.out.println("The GPA is below the "
                 + " graduation requirement. \nSee your  "
                 + "academic advisor.");                   //Line 17
    }                                                      //Line 18
}                                                          //Line 19


