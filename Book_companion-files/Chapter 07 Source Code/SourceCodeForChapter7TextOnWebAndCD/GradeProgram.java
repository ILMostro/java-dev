//Program: Compute the grade
//This program reads a course score and prints the
//associated course grade.

import java.util.*;

public class GradeProgram
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        DoubleClass courseScore = new DoubleClass();

        System.out.println("Line 1: Based on the course "
                         + "score, this program "
                         + "computes\n        the "
                         + "course grade.");           //Line 1

        getScore(courseScore);                         //Line 2
        printGrade(courseScore.getNum());              //Line 3
    }

    public static void getScore(DoubleClass score)
    {
        double s;                                      //Line 4

        System.out.print("Line 5: Enter the "
                       + "course score: ");            //Line 5
        s = console.nextDouble();                      //Line 6
        System.out.println();                          //Line 7

        score.setNum(s);                               //Line 8

        System.out.println("Line 9: The course "
                         + "score is " + s);           //Line 9
    }

    public static void printGrade(double testScore)
    {
        System.out.print("Line 10: Your grade for "
                         + "the course is ");          //Line 10

        if (testScore >= 90)                           //Line 11
            System.out.println("A");
        else if (testScore >= 80)
            System.out.println("B");
        else if (testScore >= 70)
            System.out.println("C");
        else if (testScore >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}


