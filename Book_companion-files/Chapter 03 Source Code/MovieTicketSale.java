//***************************************************************
// Author D.S. Malik
//
// Program: Movie ticket sale and donation to charity.
// This program prompts the user to input the movie name, adult
// ticket price, child ticket price, number of adult tickets
// sold, number of child tickets sold, and the percentage of the
// gross amount to be donated to the charity.
// The program outputs the movie name, the number of tickets
// sold, the gross amount, the percentage of the gross amount
// donated to the charity, the amount donated to the charity,
// and the net amount.
//***************************************************************

import javax.swing.JOptionPane;

public class MovieTicketSale
{
   public static void main(String[] args)
   {
            //Step 1
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

      movieName = JOptionPane.showInputDialog
                  ("Enter the movie name");                //Step 2

      inputStr = JOptionPane.showInputDialog
                 ("Enter the price of an adult ticket");   //Step 3
      adultTicketPrice = Double.parseDouble(inputStr);     //Step 4

      inputStr = JOptionPane.showInputDialog
                 ("Enter the price of a child ticket");    //Step 5
      childTicketPrice = Double.parseDouble(inputStr);     //Step 6

      inputStr = JOptionPane.showInputDialog
              ("Enter the number of adult tickets sold");  //Step 7
      noOfAdultTicketsSold = Integer.parseInt(inputStr);   //Step 8

      inputStr = JOptionPane.showInputDialog
             ("Enter the number of child tickets sold");   //Step 9
      noOfChildTicketsSold = Integer.parseInt(inputStr);   //Step 10

      inputStr = JOptionPane.showInputDialog
              ("Enter the percentage of the donation");    //Step 11
      percentDonation = Double.parseDouble(inputStr);      //Step 12

      grossAmount = adultTicketPrice * noOfAdultTicketsSold +
               childTicketPrice * noOfChildTicketsSold;    //Step 13

      amountDonated = grossAmount * percentDonation / 100; //Step 14
      netSaleAmount = grossAmount - amountDonated;         //Step 15

      outputStr = "Movie Name: " + movieName + "\n"
                + "Number of Tickets Sold: "
                + (noOfAdultTicketsSold +
                  noOfChildTicketsSold) + "\n"
                + "Gross Amount: $"
                + String.format("%.2f", grossAmount) + "\n"
                + "Percentage of the Gross Amount Donated: "
                + String.format("%.2f%%", percentDonation) + "\n"
                + "Amount Donated: $"
                + String.format("%.2f", amountDonated) + "\n"
                + "Net Sale: $"
                + String.format("%.2f", netSaleAmount);    //Step 16

      JOptionPane.showMessageDialog(null, outputStr,
                        "Theater Sales Data",
                        JOptionPane.INFORMATION_MESSAGE);  //Step 17
      System.exit(0);                                      //Step 18
   }
}
