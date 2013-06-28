
// This program illustrates how to read strings and numeric data.

import java.util.*;

public class Example2_17
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        String firstName;                                 //Line 1
        String lastName;                                  //Line 2

        int age;                                          //Line 3
        double weight;                                    //Line 4

        System.out.println("Enter first name, last name, "
                         + "age, and weight separated "
                         + "by spaces.");                 //Line 5
        firstName = console.next();                       //Line 6
        lastName = console.next();                        //Line 7
        age = console.nextInt();                          //Line 8
        weight = console.nextDouble();                    //Line 9

        System.out.println("Name: " + firstName
                         + " " + lastName);               //Line 10
        System.out.println("Age: " + age);                //Line 11
        System.out.println("Weight: " + weight);          //Line 12

    }
}

