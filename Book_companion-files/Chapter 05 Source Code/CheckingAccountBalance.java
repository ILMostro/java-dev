//*******************************************************
// Author: D.S. Malik
//
// Program: Checking Account Balance
// This program calculates a customer's checking account
// balance at the end of the month.
//*******************************************************

import java.io.*;
import java.util.*;

public class CheckingAccountBalance
{
    static final double MINIMUM_BALANCE = 1000.00;
    static final double SERVICE_CHARGE = 25.00;

    public static void main(String[] args)
                           throws FileNotFoundException
    {
          //Declare and initialize variables        //Step 1
        int    acctNumber;
        double beginningBalance;
        double accountBalance;

        double amountDeposited = 0.0;
        int    numberOfDeposits = 0;

        double amountWithdrawn = 0.0;
        int    numberOfWithdrawals = 0;

        double interestPaid = 0.0;

        char   transactionCode;
        double transactionAmount;

        boolean isServiceCharged = false;

        Scanner inFile = new Scanner(new FileReader("money.txt"));

        PrintWriter outFile = new PrintWriter("money.out");

        acctNumber = inFile.nextInt();                   //Step 2
        beginningBalance = inFile.nextDouble();          //Step 2

        accountBalance = beginningBalance;               //Step 3

        while (inFile.hasNext())                         //Step 4
        {
            transactionCode = inFile.next().charAt(0);   //Step 4a
            transactionAmount = inFile.nextDouble();     //Step 4b

            switch (transactionCode)
            {
            case 'D':                                    //Step 4c
            case 'd':
                accountBalance = accountBalance
                                 + transactionAmount;
                amountDeposited = amountDeposited
                                  + transactionAmount;
                numberOfDeposits++;
                break;

            case 'I':                                    //Step 4d
            case 'i':
                accountBalance = accountBalance
                                 + transactionAmount;
                interestPaid = interestPaid
                               + transactionAmount;
                break;

            case 'W':                                    //Step 4e
            case 'w':
                accountBalance = accountBalance
                                 - transactionAmount;
                amountWithdrawn = amountWithdrawn
                                  + transactionAmount;
                numberOfWithdrawals++;

                if ((accountBalance < MINIMUM_BALANCE)
                                   && (!isServiceCharged))
                {
                     accountBalance = accountBalance
                                     - SERVICE_CHARGE;
                     isServiceCharged = true;
                }
                break;

            default:
                System.out.println("Invalid transaction code: "
                                   + transactionCode + " "
                                   + transactionAmount); //Step 4f
            }//end switch

        }//end while

                //Output results    //Step 5
        outFile.printf("Account Number: %d%n", acctNumber);
        outFile.printf("Beginning Balance: $%.2f %n",
                        beginningBalance);
        outFile.printf("Ending Balance: $%.2f %n",
                        accountBalance);
        outFile.println();
        outFile.printf("Interest Paid: $%.2f %n",
                        interestPaid);
        outFile.println();
        outFile.printf("Amount Deposited: $%.2f %n",
                        amountDeposited);
        outFile.printf("Number of Deposits: %d%n",
                        numberOfDeposits);
        outFile.println();
        outFile.printf("Amount Withdrawn: $%.2f %n",
                        amountWithdrawn);
        outFile.printf("Number of Withdrawals: %d%n",
                        numberOfWithdrawals);
        outFile.println();

        if (isServiceCharged)
            outFile.printf("Service Charge: $%.2f %n",
                            SERVICE_CHARGE);

        outFile.close();
    }
}



