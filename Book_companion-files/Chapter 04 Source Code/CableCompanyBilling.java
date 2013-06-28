
//***********************************************************
// Author: D.S. Malik
//
// Program: Cable Company Billing
// This program calculates and prints a customer’s bill for
// a local cable company. The program processes two types of
// customers: residential and business.
//***********************************************************

import java.util.*;

public class CableCompanyBilling
{
    static Scanner console = new Scanner(System.in);

        //Named constants - residential customers
    static final double R_BILL_PROC_FEE = 4.50;
    static final double R_BASIC_SERV_COST = 20.50;
    static final double R_COST_PREM_CHANNEL = 7.50;

      //Named constants - business customers
    static final double B_BILL_PROC_FEE = 15.00;
    static final double B_BASIC_SERV_COST = 75.00;
    static final double B_BASIC_CONN_COST = 5.00;
    static final double B_COST_PREM_CHANNEL = 50.00;

    public static void main(String[] args)
    {
          //Variable declaration
        int accountNumber;
        char customerType;
        int noOfPremChannels;
        int noOfBasicServConn;
        double amountDue;

        System.out.println("This program computes "
                         + "a cable bill.");

        System.out.print("Enter the account "
                       + "number: ");                //Step 1
        accountNumber = console.nextInt();           //Step 2
        System.out.println();

        System.out.print("Enter the customer type: "
                       + "R or r (Residential), "
                       + "B or b(Business): ");      //Step 3
        customerType = console.next().charAt(0);     //Step 4
        System.out.println();

        switch (customerType)
        {
        case 'r':                                    //Step 5
        case 'R':
            System.out.print("Enter the number of "
                           + "premium channels: ");  //Step 5a
            noOfPremChannels = console.nextInt();    //Step 5b
            System.out.println();

            amountDue = R_BILL_PROC_FEE +            //Step 5c
                        R_BASIC_SERV_COST +
                        noOfPremChannels *
                        R_COST_PREM_CHANNEL;

            System.out.println("Account number = "
                              + accountNumber);      //Step 5d
            System.out.printf("Amount due = $%.2f %n",
                              amountDue);            //Step 5e
            break;

        case 'b':                                    //Step 6
        case 'B':
            System.out.print("Enter the number of "
                           + "basic service "
                           + "connections: ");       //Step 6a
            noOfBasicServConn = console.nextInt();   //Step 6b
            System.out.println();

            System.out.print("Enter the number of "
                           + "premium channels: ");  //Step 6c
            noOfPremChannels = console.nextInt();    //Step 6d
            System.out.println();

            if (noOfBasicServConn <= 10)             //Step 6e
                amountDue = B_BILL_PROC_FEE +
                            B_BASIC_SERV_COST +
                            noOfPremChannels *
                            B_COST_PREM_CHANNEL;
            else
                amountDue = B_BILL_PROC_FEE +
                            B_BASIC_SERV_COST +
                            (noOfBasicServConn - 10) *
                            B_BASIC_CONN_COST +
                            noOfPremChannels *
                            B_COST_PREM_CHANNEL;

            System.out.println("Account number = "
                              + accountNumber);      //Step 6f
            System.out.printf("Amount due = $%.2f %n",
                               amountDue);           //Step 6g
            break;

        default:                                     //Step 7
            System.out.println("Invalid customer type.");
        }//end switch
    }
}
