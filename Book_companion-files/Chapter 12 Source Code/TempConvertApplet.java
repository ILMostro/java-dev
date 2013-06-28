//Java program to convert the temperature between
//Celsius and Fahrenheit.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

    //public class TempConversion extends JFrame
    //
    //Replace JFrame with JApplet
    //
public class TempConvertApplet extends JApplet
{
    private JLabel celsiusLabel;
    private JLabel fahrenheitLabel;
    private JTextField celsiusTF;
    private JTextField fahrenheitTF;
    private CelsHandler celsiusHandler;
    private FahrHandler fahrenheitHandler;

    private static final int WIDTH = 500;
    private static final int HEIGHT = 50;
    private static final double FTOC = 5.0 / 9.0;
    private static final double CTOF = 1.8;   // 9 / 5
    private static final int OFFSET = 32;

     //public TempConversion()
     //
     //Replace this constructor with the init method
     //
    public void init()
    {
           //setTitle("Temperature Conversion");
           //
           //Delete setTitle
           //

        Container c = getContentPane();
        c.setLayout(new GridLayout(1, 4));

        celsiusLabel = new JLabel("Enter Celsius",
                                  SwingConstants.RIGHT);
        fahrenheitLabel = new JLabel("Enter Fahrenheit ",
                                     SwingConstants.RIGHT);

        celsiusTF = new JTextField(7);
        fahrenheitTF = new JTextField(7);

        c.add(celsiusLabel);
        c.add(celsiusTF);
        c.add(fahrenheitLabel);
        c.add(fahrenheitTF);

        celsiusHandler = new CelsHandler();
        fahrenheitHandler = new FahrHandler();
        celsiusTF.addActionListener(celsiusHandler);
        fahrenheitTF.addActionListener(fahrenheitHandler);

           //setSize(WIDTH, HEIGHT);
           //Delete: setSize(WIDTH, HEIGHT);

           //setDefaultCloseOperation(EXIT_ON_CLOSE);
           //Delete: setDefaultCloseOperation(EXIT_ON_CLOSE);

           //setVisible(true);
           //Delete: setVisible(true);
    }

    private class CelsHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double celsius, fahrenheit;

            celsius =
                  Double.parseDouble(celsiusTF.getText());
            fahrenheit = celsius * CTOF + OFFSET;
            fahrenheitTF.setText(""+
                         String.format("%.2f", fahrenheit));
        }
    }

    private class FahrHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double celsius, fahrenheit;

            fahrenheit =
                Double.parseDouble(fahrenheitTF.getText());

            celsius = (fahrenheit - OFFSET) * FTOC;
            celsiusTF.setText(""+
                          String.format("%.2f", celsius));
        }
    }

    //public static void main(String[] args)
    //{
    //    TempConversion tempConv = new TempConversion();
    //}
    //
    //Delete the method main
    //
}//end TempConvertApplet
