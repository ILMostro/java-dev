
public class ObjectsAsVariableLengthParametersVerII
{
    public static void main(String[] args)
    {

     	Clock myClock = new Clock(12, 5, 10);         //Line 1
		Clock yourClock = new Clock(8, 15, 6);        //Line 2

		Clock[] arrivalTimeEmp = new Clock[10];		  //Line 3

		for (int j = 0; j < arrivalTimeEmp.length;
		                j++)	                      //Line 4
		    arrivalTimeEmp[j] = new Clock();          //Line 5

		arrivalTimeEmp[5].setTime(8, 5, 10);          //Line 6

        printTimes(myClock, yourClock);               //Line 7

        System.out.println("\n******************"
                         + "******* \n");             //Line 8

     	printTimes(arrivalTimeEmp);                   //Line 9
    }

    public static void printTimes(Clock ... clockList)
    {
		for (Clock clockObject : clockList)           //Line 10
		     System.out.println(clockObject);         //Line 11
    }
}