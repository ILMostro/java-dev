import java.io.*;

public class PrintStackTraceExample1
{
    public static void main(String[] args)
    {
        try
        {
            methodA();
        }
        catch (Exception e)
        {
            System.out.println(e.toString() + " caught in main");
            e.printStackTrace();
        }
    }

    public static void methodA() throws Exception
    {
        methodB();
    }

    public static void methodB() throws Exception
    {
        methodC();
    }

    public static void methodC() throws Exception
    {
        throw new Exception("Exception generated in method C");
    }
}

