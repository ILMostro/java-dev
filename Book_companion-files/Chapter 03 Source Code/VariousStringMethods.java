
// This program illustrate how various String methods work.

public class VariousStringMethods
{
    public static void main(String[] args)
    {
        String sentence;
        String str1;
        String str2;
        String str3;
        int index;

        sentence = "Now is the time for the birthday party";

        System.out.println("sentence = \"" + sentence + "\"");
        System.out.println("The length of sentence = "
                         + sentence.length());

        System.out.println("The character at index 16 in "
                         + "sentence = " + sentence.charAt(16));

        System.out.println("The index of first t in sentence = "
                         + sentence.indexOf('t'));

        System.out.println("The index of for in sentence = "
                         + sentence.indexOf("for"));

        System.out.println("sentence.substring(0, 6) = \""
                          + sentence.substring(0, 6) + "\"");

        System.out.println("sentence.substring(7, 12) = \""
                          + sentence.substring(7, 12) + "\"");

        System.out.println("sentence.substring(7, 22) = \""
                          + sentence.substring(7, 22) + "\"");

        System.out.println("sentence.substring(4, 10) = \""
                          + sentence.substring(4, 10) + "\"");

        str1 = sentence.substring(0, 8);

        System.out.println("str1 = \"" + str1 + "\"");

        str2 = sentence.substring(2, 12);
        System.out.println("str2 = \"" + str2 + "\"");

        System.out.println("sentence in uppercase = \""
                         + sentence.toUpperCase() + "\"");

        index = sentence.indexOf("birthday");

        str1 = sentence.substring(index, index + 14);

        System.out.println("str1 = \"" + str1 + "\"");

        System.out.println("sentence.replace('t', 'T') = \""
                           + sentence.replace('t', 'T') + "\"");
    }
}
