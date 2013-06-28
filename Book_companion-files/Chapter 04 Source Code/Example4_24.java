import java.util.*;

public class Example4_24
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        String status1;
        String status2 = "";
        double standardExemption = 0.0;

        System.out.print("Enter the tax filing status: ");
        status1 = console.next();
        System.out.println();

        if (status1.compareTo("married") == 0)
        {
            System.out.print("Enter filing joint/separately: ");
            status2 = console.next();
            System.out.println();

            if (status2.compareTo("joint") == 0)
                standardExemption = 12000.00;
            else if (status2.compareTo("separately") == 0)
                standardExemption = 6000.00;
            else
                System.out.println("Invalid status.");
        }
        else if (status1.compareTo("single") == 0)
            standardExemption = 9000.00;
        else if (status1.compareTo("headHouseHold") == 0)
            standardExemption = 10000.00;
        else
            System.out.println("Invalid status.");

        System.out.println("Filing status: " + status1 + " " + status2);
        System.out.printf("Standard exemption: $%.2f %n",
                          standardExemption);
    }
}
