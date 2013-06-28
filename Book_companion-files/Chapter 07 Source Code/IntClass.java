

public class IntClass
{
    private int x;

    public IntClass()
    {
        x = 0;
    }

    public IntClass(int num)
    {
        x = num;
    }

    public void setNum(int num)
    {
        x = num;
    }

    public int getNum()
    {
        return x;
    }

    public void addToNum(int num)
    {
        x = x + num;
    }

    public void multiplyToNum(int num)
    {
        x = x * num;
    }

    public int compareTo(int num)
    {
        return (x - num);
    }

    public boolean equals(int num)
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
