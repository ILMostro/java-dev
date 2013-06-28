

public class Palindrome
{
    public static void main(String[] args)
    {

        System.out.println("See Programming Exercise 8.");
    }

    public static boolean isPalindrome(String str)
    {
        int len = str.length();                       //Step 1
        int i, j;

        j = len - 1;                                  //Step 2

        for (i = 0; i <= (len - 1)/2; i++)            //Step 3
        {
            if (str.charAt(i) !=  str.charAt(j))      //Step 3.a
               return false;
            j--;                                      //Step 3.b
        }

        return true;                                  //Step 4
    }
}
