
public class DClass extends BClass
{
    private int dA;

    public DClass()
    {
        super();
         dA = 0;
    }

    public DClass(char ch, double v, int a)
    {
        super(ch, v);

        dA = a;
    }

    public void setData(char ch, double v, int a)
    {
        super.setData(v);

        bCh = ch;    //initialize bCh using the assignment
                     //statement
    dA = a;
    }

    public String toString()
    {
       return (super.toString() + "Subclass dA = " + dA + '\n');
    }
}
