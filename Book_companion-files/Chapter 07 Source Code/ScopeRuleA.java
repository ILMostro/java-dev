
//import java.io.*;

public class ScopeRuleA
{
    static int x;
    static double y;

    public static void main (String[] args)
    {
        int a = 10;
        int b = 12;
        int y = 13;

        x = 14;

        System.out.println(a + " " + b + " " + " " + x + " " + y);

        funcOne(a, b);
        funcTwo(45.67, 10);
        test();
    }

    public static void funcOne(int u, int v)
    {
        int a;
        a = u + v;
        y = 30;

        w = 780;

        System.out.println("funcOne: " + a + " " + u
                         + " " + " " + v + " " + w);
    }

    static int w;

    public static void funcTwo(double z, int funcOne)
    {
        funcOne = (int) z;

        System.out.println("funcTwo: " + funcOne + " " + z);

        funcOne(5, 6);
    }

    public static void test()
    {
        int x = 10;
        int y = 90;

        x = x + 2;
        y = y + 1;

        System.out.println("test: " + x + " " + y);
    }
}