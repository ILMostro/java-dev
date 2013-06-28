
import java.awt.*;

public class FontNames
{
   public static void main(String[] args)
   {
       String[] listOfFontNames =
            GraphicsEnvironment.getLocalGraphicsEnvironment()
                      .getAvailableFontFamilyNames();

       for (int i = 0; i < listOfFontNames.length; i++)
            System.out.println(listOfFontNames[i]);
   }
}
