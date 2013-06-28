


public class StringNewOpr
{
    public static void main (String[] args)
    {
        String 	sentence;
        String	str1;
        String  str2;

        sentence = "hello";                   //Line 1

        str1 = sentence;

        str2 = new String("hello");

        if (sentence == str1)
            System.out.println("senetnce and str1 point to the "
                             + "same string.");
        else
            System.out.println("senetnce and str1 do not point to the "
                             + "same string.");

        if (sentence == str2)
            System.out.println("senetnce and str2 points to the "
                             + "same string.");
        else
            System.out.println("senetnce and str2 do not point to the "
                             + "same string.");

        if (str1 == str2)
            System.out.println("str1 and str2 points to the "
                             + "same string.");
        else
            System.out.println("str1 and str2 do not point to the "
                             + "same string.");

        System.out.println(sentence.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        if (sentence.equals(str2))
            System.out.println("Strings senetnce and str2 are the same.");
        else
            System.out.println("Strings senetnce and str2 are not the same.");
    }
}
