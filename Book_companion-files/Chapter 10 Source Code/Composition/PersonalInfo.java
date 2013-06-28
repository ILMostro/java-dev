
public class PersonalInfo
{
    private Person name;
    private Date bDay;
    private int personID;

        //Default constructor
        //Instance variables are set to the default values
        //Postcondition: firstName = ""; lastName = "";
        //               dMonth = 1; dDay = 1; dYear = 1900;
        //               personID = 0;
    public PersonalInfo()
    {
        name = new Person();
        bDay = new Date();
        personID = 0;
    }

        //Constructor with parameters
        //Instance variables are set according to the parameters
        //Postcondition: firstName = first; lastName = last;
        //               dMonth = month; dDay = day; dYear = year;
        //               personID = ID;
    public PersonalInfo(String first, String last, int month,
                        int day, int year, int ID)
    {
          name = new Person(first, last);  //instantiate and
                                          //initialize the object name
          bDay = new Date(month, day, year);//instantiate and
                                          //initialize the object bDay
          personID = ID;
    }

        //Method to set the personal information
        //Instance variables are set according to the parameters
        //Postcondition: firstName = first; lastName = last;
        //               dMonth = month; dDay = day; dYear = year;
        //               personID = ID;
    public void setPersonalInfo(String first, String last, int month,
                                int day, int year, int ID)
    {
        name.setName(first, last);
        bDay.setDate(month, day, year);
        personID = ID;
    }

       //Method to return the string containing personal information
    public String toString()
    {
        return ("Name: " + name.toString() + "\n"
              + "Date of birth: " + bDay.toString() + "\n"
              + "Personal ID: " + personID);
    }
}
