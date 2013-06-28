
//Program: Calculate the average test score
//This program shows how to handle a FileNotFoundException
//or any other exception.

import java.io.*;
import java.util.*;

public class StudentGrade
{
    public static void main(String[] args)
    {

           //Declare and initialize the variables   //Step 1
        double test1, test2, test3, test4, test5;
        double average;
        String firstName;
        String lastName;

        try
        {
           Scanner inFile = new Scanner
                    (new FileReader("test.txt"));   //Step 2

           PrintWriter outFile =
                 new PrintWriter("testavg.out");    //Step 3

           firstName = inFile.next();               //Step 4
           lastName = inFile.next();                //Step 4

           outFile.println("Student Name: "
                          + firstName + " "
                          + lastName);              //Step 5

               //Step 6 - retrieve the five test scores
           test1 = inFile.nextDouble();
           test2 = inFile.nextDouble();
           test3 = inFile.nextDouble();
           test4 = inFile.nextDouble();
           test5 = inFile.nextDouble();

           outFile.printf("Test scores: %5.2f %5.2f %5.2f "
                        + "%5.2f %5.2f %n", test1,
                          test2, test3, test4,
                          test5);                   //Step 7

           average = (test1 + test2 + test3 + test4
                    + test5) / 5.0;                 //Step 8

           outFile.printf("Average test score: %5.2f %n",
                           average);                //Step 9

           outFile.close();                         //Step 10

      }
      catch (FileNotFoundException fnfeRef)
      {
          System.out.println(fnfeRef.toString());
      }
      catch (Exception eRef)
      {
          System.out.println(eRef.toString());
      }
   }
}


