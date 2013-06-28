
import java.io.*;

public class Course
{
    private String courseName;  //object to store the
                                //course name
    private String courseNo;    //object to store the
                                //course number
    private int courseCredits;  //variable to store the
                                //course credits

       //Default Constructor
       //The object is initialized to the default values.
        //Postcondition: courseName = ""; courseNo = "";
       //               courseCredits = 0;
    public Course()
    {
        courseName = "";
        courseNo = "";
        courseCredits = 0;
    }

       //Constructor
       //The object is initialized according to the parameters.
       //Postcondition: courseName = cName; courseNo = cNo;
       //               courseCredits = credits;
    public Course(String cName, String cNo, int credits)
    {
        courseName = cName;
        courseNo = cNo;
        courseCredits = credits;
    }

       //Method to set the course information
       //The course information is set according to the
       //parameters.
       //Postcondition: courseName = cName; courseNo = cNo;
       //               courseCredits = credits;
    public void setCourseInfo(String cName, String cNo,
                              int credits)
    {
        courseName = cName;
        courseNo = cNo;
        courseCredits = credits;
    }

       //Method to set the course Name
       //Postcondition: courseName = cName;
    public void setCourseName(String cName)
    {
    	courseName = cName;
    }

       //Method to set the course Number
       //Postcondition: courseNo = cNo;
    public void setCourseNumber(String cNo)
    {
        courseNo = cNo;
    }

       //Method to set the course credits
       //Postcondition: courseCredits = credits;
    public void setCourseCredits(int credits)
    {
        courseCredits = credits;
    }

       //Method to return the course information as a string
	   //Postcondition: The course information is returned
	   //               as a string.
    public String toString()
	{
	    return String.format("%-12s%-15s%4s", courseNo,
	                         courseName, courseCredits);
	} //end toString

       //Method to return the course name
       //Postcondition: The value of courseName is returned.
    public String getCourseName()
    {
        return courseName;
    }

       //Method to return the course number
       //Postcondition: The value of courseNo is returned.
    public String getCourseNumber()
    {
        return courseNo;
    }

       //Method to return the credit hours
       //The value of the private data member courseCredits
       //is returned.
    public int getCredits()
    {
        return courseCredits;
    }

       //Method to copy a course’s information.
       //otherCourse is copied into this course
       //Postcondition: courseName = otherCourse.courseName;
       //               courseNo = otherCourse.courseNo;
       //               courseCredits = otherCourse.courseCredits;
    public void copyCourseInfo(Course otherCourse)
    {
        courseName = otherCourse.courseName;
        courseNo = otherCourse.courseNo;
        courseCredits = otherCourse.courseCredits;
    }
}
