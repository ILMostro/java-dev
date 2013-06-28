//A la Carte

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class AlaCarte extends JFrame implements ActionListener
{
   static String[] yourChoicesItems =
                           {"Blueberry Muffin    1.45",
                            "Strawberry Bagel    0.80",
                            "Lite Yogurt         0.75",
                            "Vanilla Ice Cream   2.75",
                            "Hash Browns         2.50",
                            "Toast               2.00",
                            "French Fries        1.50",
                            "Onion Soup          3.00",
                            "Coffee              0.90",
                            "Iced Tea            1.00",
                            "Hot Chocolate       1.75"};

   static double[] yourChoicesPrices = {1.45, 0.80, 0.75, 2.75,
                                       2.50, 2.00, 1.50, 3.00,
                                       0.90, 1.00, 1.75};
   private JList yourChoices;
   private JTextArea  bill;

   private Container pane;

   public AlaCarte()
   {
      super("Welcome to Java Kiosk");

         //Get the content pane and set its background color
         //and layout manager.
      pane = getContentPane();
      pane.setBackground(new Color(0, 200, 200));
      pane.setLayout(new BorderLayout(5, 5));

          //Create a label and place it at NORTH. Also
          //set the font of this label.
      JLabel yourChoicesJLabel = new JLabel("A LA CARTE MENU");
      pane.add(yourChoicesJLabel,BorderLayout.NORTH);
      yourChoicesJLabel.setFont(new Font("Dialog",Font.BOLD,20));

          //Create a list and place it at WEST. Also
          //set the font of this list.
      yourChoices = new JList(yourChoicesItems);
      pane.add(new JScrollPane (yourChoices),BorderLayout.WEST);
      yourChoices.setFont(new Font("Courier",Font.BOLD,14));

          //Create a text area and place it at EAST. Also
          //set the font of this text area.
      bill = new JTextArea();
      pane.add(bill,BorderLayout.EAST);
      bill.setFont(new Font("Courier",Font.PLAIN,12));

          //Create a button and place it in the SOUTH region
          //and add an action listener.
      JButton button = new JButton("Selection Completed");
      pane.add(button,BorderLayout.SOUTH);
      button.addActionListener(this);

      setSize(500, 360);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

           //Method to display the order and the total cost.
   private void displayBill()
   {
      int[] listArray = yourChoices.getSelectedIndices();
      double localTax = 0.065;
      double tax;
      double subTotal = 0;
      double total;

         //Set the text area to non-edit mode and start
         //with an empty string.
      bill.setEditable(false);
      bill.setText("");

          //Calculate the cost of the items ordered.
      for (int index = 0; index < listArray.length; index++)
          subTotal = subTotal
                     + yourChoicesPrices[listArray[index]];

      tax = localTax * subTotal;
      total = subTotal + tax;

          //Display the costs.
      bill.append("           JAVA KIOSK A LA CARTE\n\n");
      bill.append("--------------- Welcome ----------------\n\n");

      for (int index = 0; index < listArray.length; index++)
      {
         bill.append(yourChoicesItems[listArray[index]] + "\n");
      }

      bill.append("\n");
      bill.append("SUB TOTAL\t\t$"
                 + String.format("%.2f", subTotal) + "\n");
      bill.append("TAX      \t\t$"
                 + String.format("%.2f", tax) + "\n");
      bill.append("TOTAL    \t\t$"
                 + String.format("%.2f", total) + "\n\n");
      bill.append("Thank you - Have a Nice Day\n\n");

          //Reset list array.
      yourChoices.clearSelection();

      repaint();
   }

   public void actionPerformed(ActionEvent event)
   {
      if (event.getActionCommand().equals("Selection Completed"))
          displayBill();
   }

   public static void main(String[] args)
   {
        AlaCarte alc = new AlaCarte();
   }
}
