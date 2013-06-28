//*******************************************************
// Author: D. S. Malik
//
// Program Convert: This program converts measurements
// in feet and inches into centimeters using the formula
// that 1 inch is equal to 2.54 centimeters.
//*******************************************************

import java.util.*;

public class Conversion
{
   static Scanner console = new Scanner(System.in);

   static final double CENTIMETERS_PER_INCH = 2.54;
   static final int INCHES_PER_FOOT = 12;

   public static void main(String[] args)
   {
          //declare variables
      int feet;
      int inches;
      int totalInches;

      double centimeters;

      System.out.print("Enter feet: ");                  //Step 1
      feet = console.nextInt();                          //Step 2
      System.out.println();
      System.out.print("Enter inches: ");                //Step 3
      inches = console.nextInt();                        //Step 4
      System.out.println();
      System.out.println("The numbers you entered are "
                        + feet + " for feet and "
                        + inches + " for inches.");      //Step 5

      totalInches = INCHES_PER_FOOT * feet + inches;     //Step 6

      System.out.println();
      System.out.println("The total number of inches = "
                        + totalInches);                  //Step 7

      centimeters = totalInches * CENTIMETERS_PER_INCH;  //Step 8

      System.out.println("The number of centimeters = "
                        + centimeters);                  //Step 9
   }
}


