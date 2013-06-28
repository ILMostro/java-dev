//StringVectorExample

import java.util.Vector;

public class StringVectorExampleII
{
    public static void main(String[] arg)
    {
        Vector<String> stringList =
                            new Vector<String>();

        stringList.addElement("One");
        stringList.addElement("Two");
        stringList.addElement("Three");
        stringList.addElement("Four");
        stringList.addElement("Five");
        stringList.addElement("Six");
        stringList.addElement("Seven");

        System.out.println("stringList: " + stringList);

        for (String str : stringList)
            System.out.println(str.toUpperCase());
     }
}
