
// This program illustrates how the objects of a superclass and a
// base class work.

public class SubClassSuperClassMethods                  //Line 1
{                                                       //Line 2
   public static void main(String[] args)               //Line 3
   {                                                    //Line 4
      Rectangle myRectangle1 = new Rectangle();         //Line 5
      Rectangle myRectangle2 = new Rectangle(8, 6);     //Line 6

      Box myBox1 = new Box();                           //Line 7
      Box myBox2 = new Box(10, 7, 3);                   //Line 8

      System.out.println("Line 9: myRectangle1: "
                       + myRectangle1);                 //Line 9

      System.out.println("Line 10: Area of myRectangle1: "
                        + myRectangle1.area());         //Line 10

      System.out.println("Line 11: myRectangle2: "
                       + myRectangle2);                 //Line 11
      System.out.println("Line 12: Area of myRectangle2: "
                        + myRectangle2.area());         //Line 12

      System.out.println("Line 13: myBox1: " + myBox1); //Line 13

      System.out.println("Line 14: Surface Area of myBox1: "
                        + myBox1.area());               //Line 14
      System.out.println("Line 15: Volume of myBox1: "
                        + myBox1.volume());             //Line 15

      System.out.println("Line 16: myBox2: " + myBox2); //Line 16

      System.out.println("Line 17: Surface Area of myBox2: "
                        + myBox2.area());               //Line 17
      System.out.println("Line 18: Volume of myBox2: "
                        + myBox2.volume());             //Line 18
   }                                                    //Line 19
}                                                       //Line 20



