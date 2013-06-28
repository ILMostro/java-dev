
public class Date
{
    private int dMonth;    //variable to store the month
    private int dDay;      //variable to store the day
    private int dYear;     //variable to store the year

       //Default constructor
       //The instance variables dMonth, dDay, and dYear are set to
       //the default values.
       //Postcondition: dMonth = 1; dDay = 1; dYear = 1900;
    public Date()
    {
        dMonth = 1;
        dDay = 1;
        dYear = 1900;
    }

       //Constructor to set the date
       //The instance variables dMonth, dDay, and dYear are set
       //according to the parameters.
       //Postcondition: dMonth = month; dDay = day;
       //               dYear = year;
    public Date(int month, int day, int year)
    {
        dMonth = month;
        dDay = day;
        dYear = year;
    }

       //Method to set the date
       //The instance variables dMonth, dDay, and dYear are set
       //according to the parameters.
       //Postcondition: dMonth = month; dDay = day;
       //               dYear = year;
    public void setDate(int month, int day, int year)
    {
        dMonth = month;
        dDay = day;
        dYear = year;
    }

       //Method to return the month
       //Postcondition: The value of dMonth is returned.
    public int getMonth()
    {
        return dMonth;
    }

       //Method to return the day
       //Postcondition: The value of dDay is returned.
   public int getDay()
    {
        return dDay;
    }
       //Method to return the year
       //Postcondition: The value of dYear is returned.
    public int getYear()
    {
        return dYear;
    }

       //Method to return the date in the form mm-dd-yyyy
    public String toString()
    {
        return (dMonth + "-" + dDay + "-" + dYear);
    }
}

