
// This program illustrates how explicit type conversion works.

public class Example2_8
{
    public static void main(String[] args)
    {
        System.out.println("(int)(7.9) = " + (int)(7.9));
        System.out.println("(int)(3.3)  = " + (int)(3.3));
        System.out.println("(double)(25) = " + (double)(25));
        System.out.println("(double)(5 + 3) = "
                          + (double)(5 + 3));
        System.out.println("(double)(15) / 2 = "
                         + ((double)(15) / 2));
        System.out.println("(double)(15 / 2) = "
                         + ((double)(15 / 2)));
        System.out.println("(int)(7.8 + (double)(15) / 2) = "
                          + ((int)(7.8 + (double)(15) / 2)));
        System.out.println("(int)(7.8 + (double)(15 / 2)) = "
                          + ((int)(7.8 + (double)(15 / 2))));
    }
}

