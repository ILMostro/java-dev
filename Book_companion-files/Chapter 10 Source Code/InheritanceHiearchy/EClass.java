
public class EClass extends DClass
{
   	private int dAE;

	public EClass()
	{
    	super();
    	dAE = 0;
	}

	public EClass(char ch, double v, int a, int b)
	{
    	super(ch, v, a);

    	dAE = a;
	}

	public void setData(char ch, double v, int a, int b)
	{
		setData(ch, v, a);

		bCh = '$';	//initialize bCh using the assignment
  		 			//statement
		dAE = b;
	}

   	public String toString()
   	{
       return (super.toString() + "Subclass dAE = " + dAE + '\n');
   	}
}
