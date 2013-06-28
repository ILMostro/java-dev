
public class SuperSubClassObjects
{
    public static void main(String[] args)
    {
        RectangleShape  rectangle, rectRef;                 //Line 1
        BoxShape box, boxRef;                               //Line 2

        rectangle = new RectangleShape(12, 4);              //Line 3
        System.out.println("Line 4: Rectangle \n"
                           + rectangle+ "\n");              //Line 4
        box = new BoxShape(13, 7, 4);                       //Line 5
        System.out.println("Line 6: Box\n"
                           + box+ "\n");                    //Line 6
        rectRef = box;                                      //Line 7
        System.out.println("Line 8: Box via rectRef\n"
                           + rectRef+ "\n");                //Line 8


        boxRef = (BoxShape) rectRef;                        //Line 9
        System.out.println("Line 10: Box via boxRef\n"
                           + boxRef + "\n");                //Line 10

        if (rectRef instanceof BoxShape)                    //Line 11
            System.out.println("Line 12: rectRef is "
                             + "an instance of BoxShape");  //Line 12
        else                                                //Line 13
           System.out.println("Line 14: rectRef is not "
                             + "an instance of BoxShape");  //Line 14

        if (rectangle instanceof BoxShape)                  //Line 15
            System.out.println("Line 16: rectangle is "
                             + "an instance of BoxShape");  //Line 16
        else                                                //Line 17
            System.out.println("Line 18: rectangle is not "
                             + "an instance of BoxShape");  //Line 18
    }
}
