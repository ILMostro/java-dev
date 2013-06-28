
//********************************************************
// Program: Telephone Digits
// This is an example of a sentinel-controlled while loop.
// This program converts uppercase letters to their
// corresponding telephone digits.
//********************************************************

import javax.swing.JOptionPane;

public class TelephoneDigitProgram
{
    public static void main (String[] args)
    {
        char letter;                                     //Line 1

        String inputMessage;                             //Line 2
        String inputString;                              //Line 3
        String outputMessage;                            //Line 4

        inputMessage = "Program to convert uppercase "
                     + "letters to their corresponding "
                     + "telephone digits.\n"
                     + "To stop the program enter #.\n"
                     + "Enter a letter:";                //Line 5

        inputString =
              JOptionPane.showInputDialog(inputMessage); //Line 6

        letter = inputString.charAt(0);                  //Line 7

        while (letter != '#' )                           //Line 8
        {
            outputMessage = "The letter you entered is: "
                          + letter + "\n"
                          + "The corresponding telephone "
                          + "digit is: ";                //Line 9

            if (letter >= 'A' && letter <= 'Z')          //Line 10
            {
                switch (letter)                          //Line 11
                {
                case 'A':
                case 'B':
                case 'C':
                    outputMessage = outputMessage
                                   + "2";                //Line 12
                    break;                               //Line 13
                case 'D':
                case 'E':
                case 'F':
                    outputMessage = outputMessage
                                   + "3";                //Line 14
                    break;                               //Line 15
                case 'G':
                case 'H':
                case 'I':
                    outputMessage = outputMessage
                                   + "4";                //Line 16
                    break;                               //Line 17
                case 'J':
                case 'K':
                case 'L':
                    outputMessage = outputMessage
                                   + "5";                //Line 18
                    break;                               //Line 19
                case 'M':
                case 'N':
                case 'O':
                    outputMessage = outputMessage
                                   + "6";                //Line 20
                    break;                               //Line 21
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    outputMessage = outputMessage
                                   + "7";               //Line 22
                    break;                              //Line 23
                case 'T':
                case 'U':
                case 'V':
                    outputMessage = outputMessage
                                   + "8";                //Line 24
                    break;                               //Line 25
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    outputMessage = outputMessage
                                   + "9";                //Line 26
                }
            }
            else                                         //Line 27
                outputMessage = outputMessage
                              + "Invalid input";         //Line 28

            JOptionPane.showMessageDialog(null, outputMessage,
                             "Telephone Digit",
                             JOptionPane.PLAIN_MESSAGE); //Line 29

            inputMessage = "Enter another uppercase letter "
                         + "to find its corresponding "
                         + "telephone digit.\n"
                         + "To stop the program enter #.\n"
                         + "Enter a letter:";            //Line 30

            inputString =
              JOptionPane.showInputDialog(inputMessage); //Line 31

            letter = inputString.charAt(0);              //Line 32
        }//end while

        System.exit(0);                                  //Line 33
    }
}




