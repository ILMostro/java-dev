

public class FloatingPointNumbers
{
    public static void main(String[] args)
    {
        double x = 1.0;
        double y = 3.0 / 7.0 + 2.0 / 7.0 + 2.0 / 7.0;

        System.out.println("3.0 / 7.0 + 2.0 / 7.0 + 2.0 / 7.0 = "
                          + (3.0 / 7.0 + 2.0 / 7.0 + 2.0 / 7.0));

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        if (x == y)
            System.out.println("x and y are the same.");
        else
            System.out.println("x and y are not the same.");

        if (Math.abs(x - y) < 0.000001)
            System.out.println("x and y are the same within the "
                 + "tolerance 0.000001.");
        else
            System.out.println(" x and y are not the same within "
                             + "the tolerance 0.000001.");
    }
}
