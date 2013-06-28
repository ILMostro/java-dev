
// This program illustrates how input statements work.

import java.util.*;

public class Example2_16
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int feet;
        int inches;

        System.out.println("Enter two integers separated by spaces.");

        feet = console.nextInt();
        inches = console.nextInt();

        System.out.println("Feet = " + feet);
        System.out.println("Inches = " + inches);
    }
}

