import java.util.*;

public class TestProgClock
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        Clock myClock = new Clock(5,4,30);              //Line 1
        Clock yourClock = new Clock();                  //Line 2

        int hours;                                      //Line 3
        int minutes;                                    //Line 4
        int seconds;                                    //Line 5

        System.out.println("Line 6: myClock: "
                           + myClock);                  //Line 6

        System.out.println("Line 7: yourClock: "
                           + yourClock);                //Line 7

        yourClock.setTime(5,45,16);                     //Line 8

        System.out.println("Line 13: After setting the "
                         + "time, yourClock: "
                         + yourClock);                  //Line 9

        if (myClock.equals(yourClock))                  //Line 10
            System.out.println("Line 11: Both times "
                             + "are equal.");           //Line 11
        else                                            //Line 12
            System.out.println("Line 13: The two times "
                             + "are not equal");        //Line 13

        System.out.print("Line 14: Enter the hours, "
                       + "minutes, and seconds: ");     //Line 14

        hours = console.nextInt();                      //Line 15
        minutes = console.nextInt();                    //Line 16
        seconds = console.nextInt();                    //Line 17
        System.out.println();                           //Line 18

        myClock.setTime(hours,minutes,seconds);         //Line 19

        System.out.println("Line 20: New myClock: "
                         + myClock);                    //Line 20

        myClock.incrementSeconds();                     //Line 21

        System.out.printf("Line 22: After incrementing "
                        + "the clock by one second, "
                        + "myClock: %s%n", myClock);    //Line 22

        yourClock.makeCopy(myClock);                    //Line 23
        System.out.println("Line 24: After copying "
                         + "myClock into yourClock, "
                         + "yourClock: " + yourClock);  //Line 24
    }//end main
}
