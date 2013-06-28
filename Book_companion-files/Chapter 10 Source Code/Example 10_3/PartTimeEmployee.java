
public class PartTimeEmployee extends Person
{
   private double payRate;     //store the pay rate
   private double hoursWorked; //store the hours worked

      //Default constructor
      //Set the first name, last name, payRate, and
      //hoursWorked to the default values.
      //The first name and last name are initialized to an empty
      //string by the default constructor of the superclass.
      //Postcondition: firstName = ""; lastName = "";
      //               payRate = 0; hoursWorked = 0;
   public PartTimeEmployee()
   {
       super();
       payRate = 0;
       hoursWorked = 0;
   }

      //Constructor with parameters
      //Set the first name, last name, payRate, and hoursWorked
      //according to the parameters. Parameters first and
      //last are passed to the superclass.
      //Postcondition: firstName = first; lastName = last;
      //               payRate = rate; hoursWorked = hours;
   public PartTimeEmployee(String first, String last,
                           double rate, double hours)
   {
       super(first, last);
       payRate = rate;
       hoursWorked = hours;
   }

      //Method to return the string consisting of the
      //first name, last name, and the wages in the form:
      //firstName lastName wages are $$$$.$$
   public String toString()
   {
       return (super.toString() + "\'s wages are: $" + calculatePay());
   }

       //Method to calculate and return the wages
   public double calculatePay()
   {
       return (payRate * hoursWorked);
   }

      //Method to set the first name, last name, payRate, and
      //hoursWorked according to the parameters. The parameters
      //first and last are passed to the superclass.
      //Postcondition: firstName = first; lastName = last;
      //               payRate = rate; hoursWorked = hours;
   public void setNameRateHours(String first, String last,
                                double rate, double hours)

   {
       setName(first,last);
       payRate = rate;
       hoursWorked = hours;
   }

      //Method to return the pay rate
      //Postcondition: The value of payRate is returned
   public double getPayRate()
   {
       return payRate;
   }

      //Method to return the number of hours worked
      //Postcondition: The value of hoursWorked is returned
   public double getHoursWorked()
   {
       return hoursWorked;
   }
}


