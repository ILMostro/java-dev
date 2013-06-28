//************************************************************
//  Author: D. S. Malik
//
// Program Make Change: Given any amount of change expressed
// in cents, this program computes the number of half-dollars,
// quarters, dimes, nickels, and pennies to be returned,
// returning as many half-dollars as possible, then quarters,
// dimes, nickels, and pennies, in that order.
//************************************************************

import java.util.*;

public class MakeChange
{
   static Scanner console = new Scanner(System.in);

   static final int HALFDOLLAR = 50;
   static final int QUARTER  = 25;
   static final int DIME = 10;
   static final int NICKEL = 5;

   public static void main (String[] args)
   {
        //declare variables
      int change;

        //Statements: Step 1 - Step 12
      System.out.print("Enter the change in cents: ");   //Step 1
      change = console.nextInt();                        //Step 2
      System.out.println();

      System.out.println("The change you entered is  "
                        + change);                       //Step 3

      System.out.println("The number of half dollars "
                       + "to be returned is "
                       + change / HALFDOLLAR);           //Step 4

      change = change % HALFDOLLAR;                      //Step 5

      System.out.println("The number of quarters to be "
                       + "returned is "
                       + change / QUARTER);              //Step 6

      change = change % QUARTER;                         //Step 7

      System.out.println("The number of dimes to be "
                              + "returned is "
                              + change / DIME);          //Step 8

      change = change % DIME;                            //Step 9

      System.out.println("The number of nickels to be "
                       + "returned is "
                       + change / NICKEL);               //Step 10

      change = change % NICKEL;                          //Step 11

      System.out.println("The number of pennies to be "
                       + "returned is " + change);       //Step 12
   }
}

