import java.io.*;

public class PrintStackTraceExample2
{
    public static void main(String[] args)
    {
        methodA();
    }

    public static void methodA()
    {
        try
        {
            methodB();
        }
        catch (Exception e)
        {
            System.out.println(e.toString() + " caught in methodA");
            e.printStackTrace();
        }
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

