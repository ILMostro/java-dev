//*************************************************************
// Author: D. S. Malik
//
// Program: Line and letter count
// This program reads a given text, outputs the text as
// is, and prints the number of lines and the number of times
// each letter appears in the text. An uppercase letter and a
// lowercase letter are treated as being the same; that is,
// they are tallied together.
//**************************************************************

import java.io.*;

public class CharacterCount
{
    public static void main(String[] args)
                   throws FileNotFoundException, IOException
   {
        int lineCount = 0;
        int[] letterCount = new int[26];

        int next;

        FileReader inputStream = new FileReader("text.txt");

        PrintWriter outfile = new PrintWriter("textCh.out");

        next = inputStream.read();

        while (next != -1)
        {
            next = copyText(inputStream, outfile,
                            next, letterCount);
            lineCount++;
            next = inputStream.read();
        }  //end while loop

        writeTotal(outfile, lineCount, letterCount);

        outfile.close();
    }


    static int copyText(FileReader infile, PrintWriter outfile,
                         int next, int[] letterC)
                         throws IOException
    {
        while (next != (int)'\n')
        {
            outfile.print((char)(next));
            chCount((char)(next), letterC);
            next = infile.read();
        }

        outfile.println();

        return next;
    }

    static void chCount(char ch, int[] letterC)
    {
        int index;

        ch = Character.toUpperCase(ch);

        index = (int) ch - 65;

        if (index >= 0 && index < 26)
            letterC[index]++;
    }

    static void writeTotal(PrintWriter outfile, int lines,
                           int[] letters)
    {
        outfile.println();
        outfile.println("The number of lines = " + lines);

        for (int i = 0; i < 26; i++)
            outfile.println((char)(i + 65) + " count = "
                           + letters[i]);
    }
}


