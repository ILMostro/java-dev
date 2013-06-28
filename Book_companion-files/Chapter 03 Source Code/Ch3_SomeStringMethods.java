
// This program illustrates how the String methods startsWith,
// endsWith, and regionMatches work.


public class Ch3_SomeStringMethods
{
  public static void main (String[] args)
  {
     String sentence = "It is sunny and warm.";            //Line 1
     String str1 = "warm.";                                //Line 2
     String str2 = "Programming with Java";                //Line 3
     String str3 = "sunny";                                //Line 4
     String str4 = "Learning Java Programming is exciting";//Line 5

     System.out.println("Line 6: sentence = \""
                        + sentence + "\"");                //Line 6
     System.out.println("Line 7: str1 = \""
                        + str1 + "\"");                    //Line 7

     System.out.println("Line 8: sentence starts with It?: "
                       + sentence.startsWith("It"));       //Line 8
     System.out.println("Line 9: sentence starts with str1?: "
                       + sentence.startsWith(str1));       //Line 9

     System.out.println("Line 10: sentence in lowercase = \""
                        + sentence.toLowerCase() + "\"");  //Line 10

     System.out.println("Line 11: sentence ends with hot?: "
                       + sentence.endsWith("hot"));        //Line 11
     System.out.println("Line 12: sentence ends with str1?: "
                       + sentence.endsWith(str1));         //Line 12

     System.out.println("Line 13: str2 = \""
                        + str2 + "\"");                    //Line 13
     System.out.println("Line 14: str2 in lowercase: "
                       + str2.toLowerCase());              //Line 14
     System.out.println("Line 15: str3 = \""
                        + str3 + "\"");                    //Line 15

     System.out.println("Line 16: "
                + "sentence.regionMatches(6,str3,0,5)?: "
                + sentence.regionMatches(6,str3,0,5));     //Line 16
     System.out.println("Line 17: "
          + "sentence.regionMatches(true,6,\"Sunny\",0,5)?: "
          + sentence.regionMatches(true,6,"Sunny",0,5));   //Line 17

     System.out.println("Line 18: str4 = \""
                        + str4 + "\"");                    //Line 18
     System.out.println("Line 19: "
               + "str4.regionMatches(9,str2,17,4): "
               + str4.regionMatches(9,str2,17,4));         //Line 19
  }
}
