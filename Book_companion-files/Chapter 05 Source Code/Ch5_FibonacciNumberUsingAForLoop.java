
//*************************************************************
// Author: D.S. Malik
//
// Program: nth Fibonacci number
// Given the first two numbers of a Fibonacci sequence, this
// determines and outputs the desired number of the Fibonacci
// sequence.
//*************************************************************

import javax.swing.JOptionPane;

public class Ch5_FibonacciNumberUsingAForLoop
{
    public static void main (String[] args)
    {
            //Declare variables

        String inputString;
        String outputString;

        int    previous1;
        int    previous2;
        int    current = 0;
        int    counter;
        int    nthFibonacci;

        inputString =
           JOptionPane.showInputDialog("Enter the first "
                               + "Fibonacci number: ");  //Step 1
        previous1 = Integer.parseInt(inputString);       //Step 2

        inputString =
            JOptionPane.showInputDialog("Enter the second "
                                + "Fibonacci number: "); //Step 3
        previous2 = Integer.parseInt(inputString);       //Step 4

        outputString = "The first two numbers of the "
                     + "Fibonacci sequence are: "
                     + previous1 + " and " + previous2;  //Step 5

        inputString =
            JOptionPane.showInputDialog("Enter the position "
                         + "of the desired number in "
                         + "the Fibonacci sequence: ");  //Step 6
        nthFibonacci = Integer.parseInt(inputString);    //Step 7

        if (nthFibonacci == 1)                           //Step 8.a
            current = previous1;
        else if (nthFibonacci == 2)                      //Step 8.b
            current = previous2;
        else                                             //Step 8.c
        {
            for (counter = 3; counter <= nthFibonacci; counter++)
			{
			    current = previous2 + previous1;
			    previous1 = previous2;
			    previous2 = current;
			    counter++;
			}
			//end for
        }

        outputString = outputString + "\nThe "
                       + nthFibonacci
                       + "th Fibonacci number of "
                       + "the sequence is: "
                       + current;                        //Step 9

        JOptionPane.showMessageDialog(null, outputString,
                                     "Fibonacci Number",
                      JOptionPane.INFORMATION_MESSAGE);  //Step 10
        System.exit(0);
    }
}


