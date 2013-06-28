public class PredefinedMethods
{
   public static void main(String[] args)
   {
        double u, v;

        System.out.println("Line 1: 2 to the power "
                         + "of 6 = " + Math.pow(2, 6)); //Line 1

        u = 12.5;                                       //Line 2
        v = 3.0;                                        //Line 3
        System.out.println("Line 4: " + u + " to "
                         + "the power of " +  v
                         + " = " + Math.pow(u, v));     //Line 4

        System.out.println("Line 5: Square root of "
                         + "42.25 = "
                         + Math.sqrt(42.25));           //Line 5

        u = Math.pow(8.5, 2.0);                         //Line 6
        System.out.println("Line 7: u = " + u);         //Line 7
    }
}
