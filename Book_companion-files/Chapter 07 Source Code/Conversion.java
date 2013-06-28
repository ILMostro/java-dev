//Menu driven program.

import java.util.*;

public class Conversion
{
    static Scanner console = new Scanner(System.in);

    static final double CONVERSION = 2.54;

    public static void main(String[] args)
    {
        int inches;
        int centimeters;
        int choice;

        do
        {
            showChoices();
            choice = console.nextInt();
            System.out.println();

            switch (choice)
            {
            case 1:
                System.out.print("Enter inches: ");
                inches = console.nextInt();
                System.out.println();
                System.out.printf("%d inch(es) = %d centimeter(s)%n",
                               inches, inchesToCentimeters(inches));
                break;

            case 2:
                System.out.print("Enter centimeters: ");
                centimeters = console.nextInt();
                System.out.println();
                System.out.printf("%d centimeter(s) = %d inch(es)%n",
                               centimeters, centToInches(centimeters));
                break;

            case 99:
                break;

            default:
                System.out.println("Invalid input.");
            }
        }
        while (choice != 99);
    }

    public static void showChoices()
    {
        System.out.println("Enter--");
        System.out.println("1: To convert from inches to "
                         + "centimeters.");
        System.out.println("2: To convert from centimeters to "
                         + "inches.");
        System.out.println("99: To quit the program.");
    }

    public static int inchesToCentimeters(int in)
    {
        return (int) (in * CONVERSION);
    }

    public static int centToInches(int ct)
    {
        return (int) (ct / CONVERSION);
    }
}
