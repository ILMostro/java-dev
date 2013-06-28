
public class ArrayOfClockObjects
{
    public static void main(String[] args)
    {
     	Clock[] arrivalTimeEmp = new Clock[100];		//Line 1

    	for (int j = 0; j < arrivalTimeEmp.length; j++)	//Line 2
		    arrivalTimeEmp[j] = new Clock();			//Line 3

		arrivalTimeEmp[49].setTime(8,5,10); 			//Line 4

		for (int j = 0; j < arrivalTimeEmp.length; j++)	//Line 5
		    System.out.println("Employee " +  (j + 1)
		                     + " arrival time: "
		                     + arrivalTimeEmp[j]);		//Line 6
    }
}