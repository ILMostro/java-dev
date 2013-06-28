
public class DoubleClass
{
    private double x;

    public DoubleClass()
    {
        x = 0;
    }

    public DoubleClass(double num)
    {
        x = num;
    }

    public void setNum(double num)
    {
        x = num;
    }

    public double getNum()
    {
        return x;
    }

    public void addToNum(double num)
    {
        x = x + num;
    }

    public void multiplyToNum(double num)
    {
        x = x * num;
    }

    public double compareTo(double num)
    {
        return (x - num);
    }

    public boolean equals(double num)
    {
        if (x == num)
            return true;
        else
            return false;
    }

    public String toString()
    {
        return (String.valueOf(x));
    }
}
