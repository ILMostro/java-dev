//StringVectorExample

import java.util.Vector;                                //Line 1

public class StringVectorExample                        //Line 2
{                                                       //Line 3
   public static void main(String[] arg)                //Line 4
   {                                                    //Line 5
      Vector<String> stringList =
                            new Vector<String>();       //Line 6

      System.out.println("Line 7: Empty stringList?: "
                        + stringList.isEmpty());        //Line 7
      System.out.println("Line 8: Size stringList?: "
                        + stringList.size());           //Line 8
      System.out.println();                             //Line 9

      stringList.addElement("Spring");                  //Line 10
      stringList.addElement("Summer");                  //Line 11
      stringList.addElement("Fall");                    //Line 12
      stringList.addElement("Winter");                  //Line 13
      stringList.addElement("Sunny");                   //Line 14

      System.out.println("Line 15: **** After adding "
                      + "elements to stringList ****"); //Line 15
      System.out.println("Line 16: Empty stringList?: "
                      + stringList.isEmpty());          //Line 16
      System.out.println("Line 17: Size stringList?: "
                      + stringList.size());             //Line 17
      System.out.println("Line 18: stringList: "
                      + stringList);                    //Line 18

      System.out.println("Line 19: stringList contains Fall?: "
                      + stringList.contains("Fall"));   //Line 19
      System.out.println();                             //Line 20

      stringList.removeElement("Fall");                 //Line 21
      stringList.removeElementAt(2);                    //Line 22
      System.out.println("Line 23: **** After the remove"
                      + " operations ****");            //Line 23
      System.out.println("Line 24: stringList: "
                      + stringList);                    //Line 24
   }                                                    //Line 25
}                                                       //Line 26

