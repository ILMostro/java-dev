//*********************************************************
// Author: D.S. Malik
//
// Program: Comparison of Class Averages
// This program computes and compares the class averages of
// two groups of students. The results are printed in the
// form of bar graphs.
//**********************************************************

import java.io.*;
import java.util.*;

public class DataComparisonBarGraph
{
    public static void main (String[] args)
                             throws FileNotFoundException
    {
                //Step 1
        String courseId1;              //course ID for group 1
        String courseId2;              //course ID for group 2

        int numberOfCourses;

        double avg1; //average for a course in group 1
        double avg2; //average for a course in group 2
        double avgGroup1;     //average group 1
        double avgGroup2;     //average group 2


                //Step 2 Open the input and output files
        Scanner group1 =
                    new Scanner(new FileReader("group1.txt"));
        Scanner group2 =
                    new Scanner(new FileReader("group2.txt"));

        PrintWriter outfile = new PrintWriter("student.out");


        avgGroup1 = 0.0;                          //Step 3
        avgGroup2 = 0.0;                          //Step 4

        numberOfCourses = 0;                      //Step 5

                  //print heading: Step 6
        printHeading(outfile);

        while (group1.hasNext() &&
               group2.hasNext())                  //Step 7
        {
            courseId1 = group1.next();            //Step 7a
            courseId2 = group2.next();            //Step 7b

            if (!courseId1.equals(courseId2))     //Step 7c
            {
                System.out.println("Data error: Course IDs "
                                 + "do not match.");
                System.out.println("Program terminates.");
                outfile.println("Data error: Course IDs "
                              + "do not match.");
                outfile.println("Program terminates.");
                outfile.close();
                return;
            }
            else                                  //Step 7d
            {
                avg1 = calculateAverage(group1);  //Step 7d.i
                avg2 = calculateAverage(group2);  //Step 7d.ii
                printResult(outfile, courseId1,
                            1, avg1);             //Step 7d.iii
                printResult(outfile, courseId2,
                            2, avg2);             //Step 7d.iv
                avgGroup1 = avgGroup1 + avg1;     //Step 7d.v
                avgGroup2 = avgGroup2 + avg2;     //Step 7d.vi
                outfile.println();
                numberOfCourses++;                //Step 7d.vii
            }
        }//end while

        if (group1.hasNext() &&
            !group2.hasNext())                    //Step 8a
            System.out.println("Ran out of data for group 2 "
                             + "before group 1.");
        else if (!group1.hasNext() &&
                  group2.hasNext())               //Step 8b

            System.out.println("Ran out of data for "
                             + "group 1 before group 2.");
        else                                      //Step 8c
        {
            outfile.println("Group 1 -- ****");
            outfile.println("Group 2 -- ####");
            outfile.println();
            outfile.printf("Avg for group 1: %.2f%n",
                            avgGroup1 / numberOfCourses);
            outfile.printf("Avg for group 2: %.2f%n",
                           avgGroup2 / numberOfCourses);
        }

        group1.close();                           //Step 9
	    group2.close();                           //Step 9
        outfile.close();                          //Step 9
    }

    public static double calculateAverage(Scanner inp)
    {
        double totalScore = 0.0;
        int numberOfStudents = 0;
        int score = 0;
        double courseAvg;

        score = inp.nextInt();

        while (score != -999)
        {
            totalScore = totalScore + score;
            numberOfStudents++;
            score = inp.nextInt();
        }//end while

        courseAvg = totalScore / numberOfStudents;

        return courseAvg;
    }//end calculate Average

    public static void printResult(PrintWriter outp,
                                   String courseId,
                                   int groupNo, double avg)
    {
        int noOfSymbols;
        int count;

        if (groupNo == 1)
            outp.print(" " + courseId + "    ");
        else
            outp.print("        ");

        noOfSymbols = (int)(avg)/2;

        if (groupNo == 1)
            for (count = 1; count <= noOfSymbols; count++)
                outp.print("*");
        else
            for (count = 1; count <= noOfSymbols; count++)
                outp.print("#");

          outp.println();
    }//end printResults

    public static void printHeading(PrintWriter outp)
    {
        outp.println("Course         Course Average");
        outp.println("  ID    0   10   20   30   40   50   60   70"
                   + "   80   90   100");
        outp.println("        |....|....|....|....|....|....|....|"
                   + "....|....|....|");
    }//end printHeading
}
