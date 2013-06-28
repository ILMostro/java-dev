/***********************************************************************************
 * Date:Jun 27th, 2013                                            Name: Amel Hodzic
 *
 *
 * Program Description:
 *
 *
 **********************************************************************************/

import java.util.*;
import java.io.*;
import javax.swing.*;




public class Learning2
{
    public static void main(String[] args)
    {
      // Declare the variables
      String movieName;
      String inputStr;
      String outputStr;

      double adultTicketPrice;
      double childTicketPrice;

      int noOfAdultTicketsSold;
      int noOfChildTicketsSold;

      double percentDonation;
      double grossAmount;
      double amountDonated;
      double netSaleAmount;

      // Display the input dialog box to enter a movie name and retrieve the
      // movie name.
      movieName = JOptionPane.showInputDialog
        ("Enter the movie name");

      // Display input dialog box to enter the price of an adult ticket.
      inputStr = JOptionPane.showInputDialog
        ("Enter the price of an adult ticket");

      // Retrieve the price of an adult ticket.
      adultTicketPrice = Double.parseDouble(inputStr);

      // Display input dialog box to enter the price of a child ticket.
      inputStr = JOptionPane.showInputDialog
        ("Enter the price of a child ticket");
      // Retrieve the price of a child ticket.
      childTicketPrice = Double.parseDouble(inputStr);

      // Display input dialog box to enter the number of adult tickets sold.
      inputStr = JOptionPane.showInputDialog
        ("Enter the number of adult tickets sold");

      // Retrieve number of adult tickets sold.
      noOfAdultTicketsSold = Integer.parseInt(inputStr);

      // Display dialog box to prompt for number of child tickets sold.
      inputStr = JOptionPane.showInputDialog
        ("Enter the number of child tickets sold");
      // Retrieve number of child tix sold.
      noOfChildTicketsSold = Integer.parseInt(inputStr);

      // Display prompt to enter percentage of gross amount donated.
      inputStr = JOptionPane.showInputDialog
        ("Enter the percentage of the donation");
      // Retrieve percentage of gross amount donated.
      percentDonation = Double.parseDouble(inputStr);

      // Calculate the gross amount
      grossAmount = adultTicketPrice * noOfAdultTicketsSold + childTicketPrice *
        noOfChildTicketsSold;

      // Calculate the amount donated.
      amountDonated = grossAmount * percentDonation / 100;
      // Calculate the net sale amount.
      netSaleAmount = grossAmount - amountDonated;

      // Format the output string.
      outputStr = "Movie Name: " + movieName + "\n"
                + "Number of Tickets Sold: " + (noOfAdultTicketsSold +
                    noOfChildTicketsSold) + "\n"
                + "Gross Amount: $"
                + String.format("%.2f", grossAmount) + "\n"
                + "Percentage of the Gross Amount Donated: "
                + String.format("%.2f%%", percentDonation) + "\n"
                + "Amount Donated: $"
                + String.format("%.2f", amountDonated) + "\n"
                + "Net Sale: $"
                + String.format("%.2f", netSaleAmount);

      // Display the message dialog box to show the output.
      JOptionPane.showMessageDialog(null, outputStr, "Theater Sales Data", 
                JOptionPane.INFORMATION_MESSAGE);
      // Terminate the program.
      System.exit(0);
    }
}


      
      




