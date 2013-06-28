//Candy Machine Program

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CandyMachine extends JFrame
{
   private static final int WIDTH = 300;
   private static final int HEIGHT = 300;

        //Instance variables
   private CashRegister cashRegister = new CashRegister();
   private Dispenser candy = new Dispenser(100, 50);
   private Dispenser chips = new Dispenser(100, 65);
   private Dispenser gum = new Dispenser(75, 45);
   private Dispenser cookies = new Dispenser(100, 85);

   private JLabel headingMainL;
   private JLabel selectionL;

   private JButton exitB, candyB, chipsB, gumB, cookiesB;
   private ButtonHandler pbHandler;

   public CandyMachine()
   {
      setTitle("Candy Machine");      //set the window title
      setSize(WIDTH, HEIGHT);         //set the window size

      Container pane  = getContentPane();  //get the container
      pane.setLayout(new GridLayout(7,1));//set the pane layout

      pbHandler = new ButtonHandler();  //instantiate listener
                                         //object

      headingMainL =
               new JLabel("WELCOME TO SHELLY'S CANDY SHOP",
                          SwingConstants.CENTER); //instantiate
                                              //the first label
      selectionL = new JLabel("To Make a Selection, "
                            + "Click on the Product Button",
                      SwingConstants.CENTER); //instantiate
                                             //the second label

      pane.add(headingMainL); //add the first label to the pane
      pane.add(selectionL);  //add the second label to the pane

      candyB = new JButton("Candy");  //instantiate the candy
                                      //button
      candyB.addActionListener(pbHandler);   //register the
                                             //listener to the
                                             //candy button
      chipsB = new JButton("Chips");  //instantiate the chips
                                      //button
      chipsB.addActionListener(pbHandler);  //register the
                                            //listener to the
                                            //chips button
      gumB = new JButton("Gum");  //instantiate the gum button
      gumB.addActionListener(pbHandler);  //register the
                                  //listener to the gum button

      cookiesB = new JButton("Cookies");   //instantiate the
                                           //cookies button
      cookiesB.addActionListener(pbHandler); //register the
                              //listener to the cookies button

      exitB = new JButton("Exit");//instantiate the exit button
      exitB.addActionListener(pbHandler); //register the
                                 //listener to the exit button

      pane.add(candyB);   //add the candy button to the pane
      pane.add(chipsB);   //add the chips button to the pane
      pane.add(gumB);     //add the gum button to the pane
      pane.add(cookiesB); //add the cookies button to the pane
      pane.add(exitB);    //add the exit button to the pane

      setVisible(true);     //show the window and its contents
      setDefaultCloseOperation(EXIT_ON_CLOSE);

   } //end constructor

          //class to handle button events
   private class ButtonHandler implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
          if (e.getActionCommand().equals("Exit"))
              System.exit(0);
          else if (e.getActionCommand().equals("Candy"))
              sellProduct(candy, "Candy");
          else if (e.getActionCommand().equals("Chips"))
              sellProduct(chips, "Chips");
          else if (e.getActionCommand().equals("Gum"))
              sellProduct(gum, "Gum");
          else if (e.getActionCommand().equals("Cookies"))
              sellProduct(cookies, "Cookies");
      }
   }

        //Method to sell a product
   private void sellProduct(Dispenser product,
                            String productName)
   {
     int coinsInserted = 0;
     int price;
     int coinsRequired;

     String str;

     if (product.getCount() > 0)
     {
        price = product.getProductCost();
        coinsRequired = price - coinsInserted;

        while (coinsRequired > 0)
        {
            str = JOptionPane.showInputDialog("To buy "
                                  + productName
                                  + " please insert "
                                  + coinsRequired + " cents");
            coinsInserted = coinsInserted
                            + Integer.parseInt(str);
            coinsRequired = price - coinsInserted;
        }

        cashRegister.acceptAmount(coinsInserted);
        product.makeSale();

        JOptionPane.showMessageDialog(null, "Please pick up "
                               + "your "
                               + productName + " and enjoy",
                                "Thank you, Come again!",
                               JOptionPane.PLAIN_MESSAGE);
     }
     else           //dispenser is empty
        JOptionPane.showMessageDialog(null, "Sorry "
                               + productName
                               + " is sold out\n" +
                               "Make another selection",
                               "Thank you, Come again!",
                               JOptionPane.PLAIN_MESSAGE);
   }//end sellProduct

   public static void main(String[] args)
   {
        CandyMachine candyShop = new CandyMachine();
   }
}
