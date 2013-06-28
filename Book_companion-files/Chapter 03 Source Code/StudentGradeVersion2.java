//***************************************************************
// Author D.S. Malik
//
// Program to calculate the average test score.
// Given a student's name and five test scores, this program
// calculates the average test score. The student's name, the
// five test scores, and the average test score is stored in the
// file testavg.out. The data is input from the file test.txt.
//***************************************************************

import java.io.*;
import java.util.*;

public class StudentGradeVersion2
{
    public static void main(String[] args) throws
                                           FileNotFoundException
    {

          //Declare and initialize variables
        double testScore;
        double sum = 0;

        String firstName;
        String lastName;

		Scanner inFile = new Scanner(new FileReader("test.txt"));

        PrintWriter outFile =  new PrintWriter("testavg.out");

        firstName = inFile.next();
		lastName = inFile.next();

        outFile.println("Student Name: "
                       + firstName + " " + lastName);

        outFile.print("Test scores: ");

        testScore = inFile.nextDouble();     //Read the first test score
        outFile.printf(" %5.2f", testScore); //Output the test score
        sum =  sum + testScore;              //Update sum

        testScore = inFile.nextDouble();     //Read the second test score
		outFile.printf(" %5.2f", testScore); //Output the test score
        sum =  sum + testScore;              //Update sum

        testScore = inFile.nextDouble();     //Read the third test score
		outFile.printf(" %5.2f", testScore); //Output the test score
        sum =  sum + testScore;              //Update sum

        testScore = inFile.nextDouble();     //Read the fourth test score
		outFile.printf(" %5.2f", testScore); //Output the test score
        sum =  sum + testScore;              //Update sum

        testScore = inFile.nextDouble();     //Read the fifth test score
		outFile.printf(" %5.2f", testScore); //Output the test score
        sum =  sum + testScore;              //Update sum

        outFile.println();

        outFile.printf("Average test score: %5.2f %n",
                        sum / 5.0);          //Output the average test score

        inFile.close();
        outFile.close();
    }
}
