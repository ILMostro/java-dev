
public class ProtectedMemberProg
{
    public static void main(String[] args)
    {
        BClass bObject = new BClass();               //Line 1

        DClass dObject = new DClass();               //Line 2

        System.out.println("Line 3: " + bObject);    //Line 3

        System.out.println("Line 4: ***  "
                         + "Subclass object ***");   //Line 4

        dObject.setData('&', 2.5, 7);                //Line 5

        System.out.println("Line 6: " + dObject);    //Line 6
   }
}
