

public class TestReturnStatement
{
    public static void main (String[] args)
    {
        funcReturnStatementError(3);
    }

    public static int funcReturnStatementError(int z)
    {
        return z;

        System.out.println(z);   //Error: This statement cannot be reached
    }

    public static int funcReturnStatementError1(int z)
    {
		if (z < 3)
		    return 2 * z;
		else
		    return 4;

        System.out.println(z); //Error: This statement cannot be reached
    }

    public static int funcReturnStatementError2(int z)
    {
		int a;

		a = z;

		return 2 * a;

        System.out.println(z);  //Error: This statement cannot be reached

        return z;
    }
}