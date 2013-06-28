
import java.io.*;

public class Student extends Person
{
     private int sId;               //variable to store the
                                    //student ID
     private int numberOfCourses;   //variable to store the number
                                    //of courses
     private boolean isTuitionPaid; //variable to indicate whether
                                    //the tuition is paid
     private Course [] coursesEnrolled; //array to store
                                        //the courses
     private char [] courseGrades;  //array to store the
                                    //course grades

       //Default constructor
       //Postcondition: The instance variables are initialized.
    public Student()
    {
        super();
        numberOfCourses = 0;
        sId = 0;
        isTuitionPaid = false;

        coursesEnrolled = new Course[6];

        for (int i = 0; i < 6; i++)
            coursesEnrolled[i] = new Course();

        courseGrades = new char[6];

        for (int i = 0; i < 6; i++)
            courseGrades[i] = '*';

    }

       //Method to set a student's information
       //Postcondition: The instance variables are set according
       //               to the parameters.
    public void setInfo(String fName, String lName, int ID,
                        int nOfCourses, boolean isTPaid,
                        Course[] courses, char[] cGrades)
    {
        setName(fName, lName);         //set the name

        sId = ID;                      //set the student ID
        isTuitionPaid = isTPaid;       //set isTuitionPaid
        numberOfCourses = nOfCourses;  //set the number of courses

        for (int i = 0; i < numberOfCourses; i++) //set the array
        {
            coursesEnrolled[i].copyCourseInfo(courses[i]);
            courseGrades[i] = cGrades[i];
        }

         sortCourses();   //sort the array coursesEnrolled
    }

       //Method to set a student’s ID
       //Postcondition: sId = ID;
    public void setStudentId(int ID)
    {
        sId = ID;
    }

       //Method to set whether the tuition is paid
       //Postcondition: isTuitionPaid = isTPaid;
    public void setIsTuitionPaid(boolean isTPaid)
    {
        isTuitionPaid = isTPaid;
    }

       //Method to set the number of courses taken
       //Postcondition: numberOfCourses = nOfCourses;
    public void setNumberOfCourses(int nOfCourses)
    {
         numberOfCourses = nOfCourses ;
    }

       //Method to set the courses enrolled
       //Postcondition: The array courses is copied into the
       //       array coursesEnrolled, the array cGrades is
       //       copied into the array courseGrades, and these
       //       arrays are sorted.
    public void setCoursesEnrolled(Course[] courses,
                                   char[] cGrades)
    {
        for (int i = 0; i < numberOfCourses; i++)
        {
            coursesEnrolled[i].copyCourseInfo(courses[i]);
            courseGrades[i] = cGrades[i];
        }

        sortCourses();
    }

        //Method to return a student's grade report as a string
        //Postcondition: If the instance variable isTuitionPaid
        //        is true, the grades are returned; otherwise
        //        three stars are returned.
    public String toString()
    {
        String gReport;

        gReport = "Student Name: "
                 + super.toString() + "\r\n"
                 + "Student ID: " + sId + "\r\n"
                 + "Number of courses enrolled: "
                 + numberOfCourses + "\r\n"
                 + String.format("%-12s%-15s%-8s%-6s%n",
                                 "Course No", "Course Name",
                                 "Credits", "Grade");

        for (int i = 0; i < numberOfCourses; i++)
        {
            gReport = gReport + coursesEnrolled[i];

            if (isTuitionPaid)
                gReport = gReport
                        + String.format("%8s%n", courseGrades[i]);
            else
                gReport = gReport
                        + String.format("%8s%n", "***");
        }

        gReport = gReport
                  + "\r\nTotal number of credit hours: "
                  + getHoursEnrolled() + "\r\n";

         return gReport;
    } //end toString

       //Method to get a student’s ID
       //Postcondition: The value of sId is returned.
    public int getStudentId()
    {
        return sId;
    }

       //Method to return whether the tuition is paid
       //Postcondition: The value of isTuitionPaid is returned.
    public boolean getIsTuitionPaid()
    {
        return isTuitionPaid;
    }

       //Method to get the number of courses taken
       //Postcondition: The value of numberOfCourses is returned.
     public int getNumberOfCourses()
     {
         return numberOfCourses;
     }

       //Method to get a copy of a course taken
       //Postcondition: A copy of coursesEnrolled[i]
       //               is returned.
    public Course getCourse(int i)
    {
        Course temp = new Course();

        temp.copyCourseInfo(coursesEnrolled[i]);

        return temp;
    }

       //Method to return a course grade
       //Postcondition: The value of courseGrades[i] is returned.
    public char getGrade(int i)
    {
        return courseGrades[i];
    }

       //Method to return the credit hours in which a
       //student is enrolled
       //Postcondition: The total credits are calculated
       //               and returned
    public int getHoursEnrolled()
    {
        int totalCredits = 0;
        int i;

        for (i = 0; i < numberOfCourses; i++)
            totalCredits += coursesEnrolled[i].getCredits();

        return totalCredits;
    }

       //Method to return the grade point average
       //Postcondition: The GPA is calculated and returned
    public double getGpa()
    {
       double sum = 0.0;

       for (int i = 0; i < numberOfCourses; i++)
       {
            switch (courseGrades[i])
            {
            case 'A':
                sum += coursesEnrolled[i].getCredits() * 4;
                break;

            case 'B':
                sum += coursesEnrolled[i].getCredits() * 3;
                break;

            case 'C':
                sum += coursesEnrolled[i].getCredits() * 2;
                break;

            case 'D':
                sum += coursesEnrolled[i].getCredits() * 1;
                break;

            case 'F':
                break;

            default:
                System.out.println("Invalid Course Grade");
            }
       }

        return sum / getHoursEnrolled();
    }

       //Method to return the tuition fees
       //Postcondition: The billing amount is calculated
       //               and returned.
    public double billingAmount(double tuitionRate)
    {
        return tuitionRate * getHoursEnrolled();
    }

       //Method to sort the courses
       //Postcondition: The array coursesEnrolled is sorted.
       //               The grades for each course, in the
       //               array courseGrades, are also reorganized.
    private void sortCourses()
    {
        int minIndex;
        Course temp = new Course();	//variable to swap data
        String course1;
        String course2;

        char tempGrade;

        for (int i = 0; i < numberOfCourses - 1; i++)
        {
            minIndex = i;

            for (int j = i + 1; j < numberOfCourses; j++)
            {
                  //get course numbers
                course1 =
                      coursesEnrolled[minIndex].getCourseNumber();
                course2 = coursesEnrolled[j].getCourseNumber();

                if (course1.compareTo(course2) > 0)
                    minIndex = j;
            }//end for

            temp.copyCourseInfo(coursesEnrolled[minIndex]);
            coursesEnrolled[minIndex].copyCourseInfo(coursesEnrolled[i]);
            coursesEnrolled[i].copyCourseInfo(temp);

            tempGrade = courseGrades[minIndex];
            courseGrades[minIndex] = courseGrades[i];
            courseGrades[i] = tempGrade;
        }//end for
    }//end sortCourses
}

