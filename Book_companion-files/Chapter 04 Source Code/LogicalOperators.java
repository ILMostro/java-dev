//Logical operators

public class LogicalOperators
{
    public static void main(String[] args)
    {
        boolean found = true;
        double hours = 45.30;
        double overTime = 15.00;
        int count = 20;
        char ch = 'B';

        System.out.printf("found = %b, hours = %.2f, overTime = "
                        + "%.2f, count = %2d, ch = %c%n%n",
                        found, hours, overTime, count, ch);

        System.out.println("!found evaluates to " + !found);
        System.out.println("hours > 40.00 evaluates to "
                         + (hours > 40.00));
        System.out.println("!found && (hours >= 0) evaluates to "
                         + (!found && (hours >= 0)));
        System.out.println("!(found && (hours >= 0)) evaluates to "
                         + (!(found && (hours >= 0))));
        System.out.println("hours + overTime <= 75.00 evaluates to "
                         + (hours + overTime <= 75.00));
        System.out.println("(count >= 0) && (count <= 100) "
                         + "evaluates to "
                         + ((count >= 0) && (count <= 100)));
        System.out.println("('A' <= ch && ch <= 'Z') evaluates to "
                          + ('A' <= ch && ch <= 'Z'));
    }
}
