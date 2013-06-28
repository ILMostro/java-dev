public class Ch3_PrExercise2
{
   public static void main(String[] args)
   {
       System.out.print("Enter the height of the cylinder: ");
       radius = console.nextDouble();
       System.out.println();

       static Scanner console = new Scanner(System.in);

       System.out.println("Volume of the cylinder = "
                         + PI * Math.pow(radius, 2.0) * height);

       System.out.print("Enter the radius of the base of the "
                      + " cylinder: ");
       height = console.nextDouble();
       System.out.println();

       double height;
       double radius;

       System.out.println("Surface area: "
                        + (2 * PI * Math.pow(radius, 2.0))
                        + (2 * PI * radius * height));
       static final double PI = 3.14159;
   }
}
import java.util.*;

