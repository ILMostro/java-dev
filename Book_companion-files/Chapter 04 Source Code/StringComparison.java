//The String method compareTo

public class StringComparison
{
    public static void main(String[] args)
    {
        String str1 = "Hello";                           //Line 1
        String str2 = "Hi";                              //Line 2
        String str3 = "Air";                             //Line 3
        String str4 = "Bill";                            //Line 4
        String str5 = "Bigger";                          //Line 5

        System.out.println("Line 6: " +
                    "str1.compareTo(str2) evaluates to "
                  +  str1.compareTo(str2));              //Line 6

        System.out.println("Line 7: " +
                    "str1.compareTo(\"Hen\") evaluates to "
                  +  str1.compareTo("Hen"));             //Line 7

        System.out.println("Line 8: " +
                    "str4.compareTo(str3) evaluates to "
                   + str4.compareTo(str3));              //Line 8

        System.out.println("Line 9: " +
                    "str1.compareTo(\"hello\") evaluates to "
                   + str1.compareTo("hello"));           //Line 9

        System.out.println("Line 10: " +
                    "str2.compareTo(\"Hi\") evaluates to "
                   + str2.compareTo("Hi"));              //Line 10

        System.out.println("Line 11: " +
                    "str4.compareTo(\"Billy\") evaluates to "
                   + str4.compareTo("Billy"));           //Line 11

        System.out.println("Line 12: " +
                    "str5.compareTo(\"Big\") evaluates to "
                   + str5.compareTo("Big"));             //Line 12

        System.out.println("Line 13: " +
                    "str1.compareTo(\"Hello \") evaluates to "
                   + str1.compareTo("Hello "));          //Line 13
    }
}

