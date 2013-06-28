import java.util.*;
import javax.swing.*;

public class Exercises3_16
{
  public static void main(String[] args)
  {
    String inputNum1;
    String inputNum2;
    String outputStr;

    int num1;
    int num2;
    int summingNums;


    inputNum1 = JOptionPane.showInputDialog
      ("Enter the first number: ");
    num1 = Integer.parseInt(inputNum1);

    inputNum2 = JOptionPane.showInputDialog
      ("Enter the second number: ");
    num2 = Integer.parseInt(inputNum2);

    summingNums = num1 + num2;

    outputStr = "The sum of " + num1 + " and " + num2 + " = "
              + summingNums;

    JOptionPane.showMessageDialog(null, outputStr, "Summing",
        JOptionPane.INFORMATION_MESSAGE);

    System.exit(0);
  }
}

