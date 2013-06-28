
// This program rolls 100 dice. It outputs the number of times
// each number is rolled, the number(s) that are rolled the
// maximum number of times, and the maximum roll count.

import java.util.*;                                     //Line 1

public class TestProgArrayofDice                        //Line 2
{                                                       //Line 3
    static Scanner console = new Scanner(System.in);    //Line 4

    public static void main(String[] args)              //Line 5
    {                                                   //Line 6
        RollDie[] dice = new RollDie[100];              //Line 7

        int[] rollCount = new int[6];                   //Line 8
        int maxNumRoll = 0;                             //Line 9

        for (int i = 0; i < 100; i++)                   //Line 10
        {                                               //Line 11
            dice[i] = new RollDie();                    //Line 12
            dice[i].roll();                             //Line 13
        }                                               //Line 14

        System.out.println("Numbers rolled: ");         //Line 15
        for (int i = 0; i < 100; i++)                   //Line 16
        {                                               //Line 17
            int num = dice[i].getNum();                 //Line 18

            System.out.print(" " + num);                //Line 19
            rollCount[num - 1]++;                       //Line 20
            if ((i + 1) % 34 == 0)                      //Line 21
                System.out.println();                   //Line 22
        }                                               //Line 23

        System.out.println();                           //Line 24
        System.out.println("Num  Roll_Count");          //Line 25

        for (int i = 0; i < 6; i++)                     //Line 26
        {                                               //Line 27
            System.out.println(" " + (i + 1) + "      "
                            + rollCount[i]);            //Line 28
            if (rollCount[i] > rollCount[maxNumRoll])   //Line 29
                maxNumRoll = i;                         //Line 30
        }                                               //Line 31

        System.out.print("The number(s) ");             //Line 32
        for (int i = 0; i < 6; i++)                     //Line 33
            if (rollCount[i] == rollCount[maxNumRoll])  //Line 34
                System.out.print((i + 1) + " ");        //Line 35

        System.out.println("is (are) rolled maximum "
                        + "number of times, which is "
                        + rollCount[maxNumRoll] + "."); //Line 36
    }//end main                                         //Line 37
}                                                       //Line 38
