//Properly formatted Java program.

import java.util.*;

public class Example2_27B
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int num;
        double height;
        String name;

        System.out.print("Enter an integer: ");
        num = console.nextInt();
        System.out.println();

        System.out.println("num: " + num);

        System.out.print("Enter first name: ");
        name = console.next();
        System.out.println();

        System.out.print("Enter height: ");
        height = console.nextDouble();
        System.out.println();

        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
    }
}
