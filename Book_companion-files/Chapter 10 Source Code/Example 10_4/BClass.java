
public class BClass
{
    protected char bCh;
    private double bX;

       //Default constructor
    public BClass()
    {
        bCh = '*';
        bX = 0.0;
    }

       //Constructor with parameters
    public BClass(char ch, double u)
    {
        bCh = ch;
        bX = u;
    }

    public void setData(double u)
    {
        bX = u;
    }

    public void setData(char ch, double u)
    {
        bCh = ch;
        bX = u;
    }

    public String toString()
    {
        return("Superclass: bCh = " + bCh + ", bX = " + bX + '\n');
    }
}
