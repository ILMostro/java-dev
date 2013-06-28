
// This program reads data from a file consisting of students’
// names and their test scores. The program outputs each
// student’s name followed by the test score and the grade. The
// program also outputs the average test score for all students.

import java.io.*;                                         //Line 1
import java.util.*;                                       //Line 2

public class ClassAverage                                 //Line 3
{                                                         //Line 4
    public static void main(String[] args)
                           throws FileNotFoundException   //Line 5
    {                                                     //Line 6
        String firstName;                                 //Line 7
        String lastName;                                  //Line 8
        double testScore;                                 //Line 9
        char grade = ' ';                                 //Line 10
        double classAverage;                              //Line 11

        double sum = 0;                                   //Line 12
        int count = 0;                                    //Line 13

        Scanner inFile =
              new Scanner(new FileReader("stData.txt"));  //Line 14

        PrintWriter outFile =
               new PrintWriter("stData.out");             //Line 15

        while (inFile.hasNext())                          //Line 16
        {                                                 //Line 17
            firstName = inFile.next();//read the first name Line 18
            lastName = inFile.next(); //read the last name  Line 19
            testScore =
                inFile.nextDouble(); //read the test score  Line 20

            sum = sum + testScore; //update sum             Line 21
            count++;               //increment count        Line 22

               //determine the grade
            switch ((int) testScore / 10)                 //Line 23
            {                                             //Line 24
            case 0:                                       //Line 25
            case 1:                                       //Line 26
            case 2:                                       //Line 27
            case 3:                                       //Line 28
            case 4:                                       //Line 29
            case 5:                                       //Line 30
                grade = 'F';                              //Line 31
                break;                                    //Line 32

            case 6:                                       //Line 33
                grade = 'D';                              //Line 34
                break;                                    //Line 35

            case 7:                                       //Line 36
                grade = 'C';                              //Line 37
                break;                                    //Line 38

            case 8:                                       //Line 39
                grade = 'B';                              //Line 40
                break;                                    //Line 41

            case 9:                                       //Line 42
            case 10:                                      //Line 43
                grade = 'A';                              //Line 44
                break;                                    //Line 45

            default:                                      //Line 46
                System.out.println("Invalid score.");     //Line 47
            }//end switch                                 //Line 48

            outFile.printf("%-12s %-12s %4.2f %c %n",
                           firstName, lastName,
                           testScore, grade);             //Line 49
        }//end while                                      //Line 50

        outFile.println();                                //Line 51

        if (count != 0)                                   //Line 52
            outFile.printf("Class Average: %.2f %n",
                            sum / count);                 //Line 53
        else                                              //Line 54
            outFile.println("No data.");                  //Line 55

        outFile.close();                                  //Line 56
    }                                                     //Line 57
}                                                         //Line 58

