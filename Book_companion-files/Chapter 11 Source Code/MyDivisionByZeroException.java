
public class MyDivisionByZeroException extends Exception
{
    public MyDivisionByZeroException()
    {
        super("Cannot divide by zero");
    }

    public MyDivisionByZeroException(String strMessage)
    {
        super(strMessage);
    }
}
