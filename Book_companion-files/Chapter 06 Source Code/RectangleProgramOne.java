//Java program to create a window.

import javax.swing.*;

public class RectangleProgramOne extends JFrame
{
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    public RectangleProgramOne()
    {
        setTitle("Area and Perimeter of a Rectangle");
        setSize(WIDTH, HEIGHT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        RectangleProgramOne rectProg = new RectangleProgramOne();
    }
}
