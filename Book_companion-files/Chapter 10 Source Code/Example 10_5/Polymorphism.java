
// This program illustrates how polymorphic reference variables
// work.

public class Polymorphism                            //Line 1
{                                                    //Line 2
    public static void main(String[] args)           //Line 3
    {                                                //Line 4
        RectangleFigure rectangle, shapeRef;         //Line 5

        BoxFigure box;                               //Line 6

        rectangle  = new RectangleFigure(8, 5);      //Line 7
        box = new BoxFigure(10, 7, 3);               //Line 8

        shapeRef = rectangle;                        //Line 9
        System.out.println("Line 10: Rectangle:\n"
                         + shapeRef);                //Line 10
        System.out.println();                        //Line 11

        shapeRef = box;                              //Line 12
        System.out.println("Line 13: Box:\n"
                          + shapeRef);               //Line 13
        System.out.println();                        //Line 14
    } //end main                                     //Line 15
}                                                    //Line 16

