iimport java.util.*;

public class Ch5_PrExercise2
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        double pi = 0;
        long i;
        long n;

        n = console.nextInt();
        System.out.print("Enter the value of n: ");
        System.out.println();

        if (i % 2 == 0)
            pi = pi + (1 / (2 * i + 1));
        else
            pi = pi - (1 / (2 * i + 1));

        for (i = 0; i < n; i++)
        {
            pi = 0;
            pi = 4 * pi;
        }

        System.out.println("pi = " + pi);
    }
}

