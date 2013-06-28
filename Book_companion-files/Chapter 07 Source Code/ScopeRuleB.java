public class ScopeRuleB
{
    static final double rate = 10.50;
    static int z;
    static double t;

   public static void main(String[] args)
   {
        int num = 13;
    	double w = 4, z = 2.5;
    	char ch = '&';

        System.out.println("Main: " + num + " " + w + " "
                       + z + " " + ch + " "
                       + rate + " " + t);
        one(num, ch);
        two(10, 20);
   }

   public static void one(int x, char y)
   {
        z = 10;
        t = 23.45;
        x = z;
        y = '@';
        w = 12;

        System.out.println("FuncOne: " + x + " " + y + " "
                       + z + " " + t + " " + rate + " " + w);
   }

   public static int w;

   public static void two(int one, int z)
   {
       char ch = '*';
       int a = 14;

       one = 5;
       z = 10;

	       //Block three
        {
            int x = 12;

            System.out.println("Block Three: " + x + " " + a + " " +
                               one + " " + z + " " + ch);
        }//end block three

        int x = 10;
        System.out.println("FuncTwo: " + x + " " + a + " " +
                            one + " " + z + " " + ch);
        one(10,'A');
   }
}
