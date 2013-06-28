
public class ScopeRules
{
   static final double rate = 10.50;
   static int z;
   static double t;

   public static void main(String[] args)
   {
    	int num;
    	double x, z;
    	char ch;

		//...
   }

   public static void one(int x, char y)
   {
      //...
   }

   public static int w;

   public static void two(int one, int z)
   {
       char ch;
       int a;


	 	//block three
       	{
            int x = 12;

    		//...
        }//end block three
      	//...
   }
}
