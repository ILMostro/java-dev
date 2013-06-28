
//Recursion: Factorial

public class factorial
{
    public static void main(String[] args)
    {
        System.out.println("Factorial of 6 = " + fact(6));
        System.out.println("Factorial of 10 = " + fact(10));
    }

    public static int fact(int num)
    {
        if (num == 0)
            return 1;
        else
            return num * fact(num - 1);
    }
}