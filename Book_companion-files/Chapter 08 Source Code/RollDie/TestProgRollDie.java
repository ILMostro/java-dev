
// Program to test various operations of the class RollDie.

import java.util.*;                                    //Line 1

public class TestProgRollDie                           //Line 2
{                                                      //Line 3
    static Scanner console = new Scanner(System.in);   //Line 4

    public static void main(String[] args)             //Line 5
    {                                                  //Line 6
        RollDie die1 = new RollDie();                  //Line 7
        RollDie die2 = new RollDie();                  //Line 8

        System.out.println("Line 9: die1: " + die1);   //Line 9

        System.out.println("Line 10: die2: " + die2);  //Line 10

        System.out.println("Line 11: After rolling "
                         + "die1: " + die1.roll());    //Line 11

        System.out.println("Line 12: After rolling "
                         + "die2: " + die2.roll());    //Line 12

        System.out.println("Line 13: Sum of the "
                 + "numbers rolled by the dice is: "
                 + (die1.getNum() + die2.getNum()));   //Line 13

        System.out.println("Line 14: After again rolling "
                 + "the sum of the numbers rolled is: "
                 + (die1.roll() + die2.roll()));       //Line 14
    }//end main                                        //Line 15
}                                                      //Line 16
