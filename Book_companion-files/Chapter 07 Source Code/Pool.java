import java.util.*;

public class Pool
{
    static Scanner console = new Scanner(System.in);

    static final double GALLONS_IN_A_CUBIC_FEET = 7.48;

    public static void main(String[] args)
    {
        double length, width, depth;
        double fillRate;
        int fillTime;

        System.out.print("Enter the length, width, and the "
                       + "depth of the pool, (in feet): ");
        length = console.nextDouble();
        width = console.nextDouble();
        depth = console.nextDouble();
        System.out.println();

        System.out.print("Enter the rate of the water, "
                       + "(in gallons per minute): ");
        fillRate = console.nextInt();
        System.out.println();

        fillTime = poolFillTime(length, width, depth, fillRate);
        print(fillTime);
    }

    public static double poolCapacity(double len, double wid,
                                     double dep)
    {
        double volume;
        double poolWaterCapacity;

        volume = len * wid * dep;
        poolWaterCapacity = volume * GALLONS_IN_A_CUBIC_FEET;

        return poolWaterCapacity;
    }

    public static int poolFillTime(double len, double wid,
                                   double dep, double fRate)
    {
        double poolWaterCapacity;

        poolWaterCapacity = poolCapacity(len, wid, dep);
        return (int) (poolWaterCapacity / fRate + 0.5);
    }

    public static void print(int fTime)
    {
        System.out.println("The time to fill the pool is "
                         + "approximately: " + fTime / 60
                         + " hour(s) and " + fTime % 60
                         + " minute(s).");
    }
}
