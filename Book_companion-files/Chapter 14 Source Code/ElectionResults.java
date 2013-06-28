//**************************************************************
// Author: D.S. Malik
//
// Program: Election Results
// Given candidates' voting data, this program determines the
// winner of the election. The program outputs the votes
// received by each candidate and the winner.
//**************************************************************

import java.io.*;
import java.util.*;

public class ElectionResults
{
    final static int NO_OF_CANDIDATES = 6;
    final static int NO_OF_REGIONS = 4;

    public static void main (String[] args) throws
                                    FileNotFoundException
    {
             //Step 1
        String[] candidatesName = new String[NO_OF_CANDIDATES];

        int[][] votesByRegion =
                new int[NO_OF_CANDIDATES][NO_OF_REGIONS];

        int[] totalVotes = new int[NO_OF_CANDIDATES];

        Scanner inFile = new Scanner(new
                     FileReader("candData.txt"));      //Step 2

        getCandidatesName(inFile, candidatesName);     //Step 3
        sortCandidatesName(candidatesName);            //Step 4

        inFile = null;
        inFile = new Scanner(new
                   FileReader("voteData.txt"));        //Step 5

        processVotes(inFile, candidatesName,
                     votesByRegion);                   //Step 6
        addRegionsVote(votesByRegion, totalVotes);     //Step 7

        printHeading();                                //Step 8
        printResults(candidatesName, votesByRegion,
                     totalVotes);                      //Step 9
   }


    public static void getCandidatesName(Scanner inp,
                                         String[] cNames)
    {
        int i;

        for (i = 0; i < cNames.length; i++)
            cNames[i] = inp.next();
    }

    public static void sortCandidatesName(String[] cNames)
    {
        int i, j;
        int min;
        String temp;

            //selection sort
        for (i = 0; i < cNames.length - 1; i++)
        {
            min = i;

            for (j = i + 1; j < cNames.length; j++)
                if (cNames[j].compareTo(cNames[min]) < 0)
                    min = j;

            temp = cNames[i];
            cNames[i] = cNames[min];
            cNames[min] = temp;
        }
    }

    public static int binSearch(String[] cNames, String name)
    {
        int first, last;
        int mid = 0;

        boolean found;

        first = 0;
        last = cNames.length - 1;
        found = false;

        while (first <= last && !found)
        {
            mid = (first + last) / 2;

            if (cNames[mid].equals(name))
                found = true;
            else if (cNames[mid].compareTo(name) > 0)
                last = mid - 1;
            else
                first = mid + 1;
        }

        if (found)
            return mid;
        else
            return -1;
    }

    public static void processVotes(Scanner inp,
                                    String[] cNames,
                                    int[][] vbRegion)
    {
        String candName;
        int region;
        int noOfVotes;
        int loc;

        while (inp.hasNext())
        {
            candName = inp.next();
            region = inp.nextInt();
            noOfVotes = inp.nextInt();

            loc =  binSearch(cNames, candName);

            if (loc != -1)
                vbRegion[loc][region - 1] =
                      vbRegion[loc][region - 1] + noOfVotes;
        }
    }

    public static void addRegionsVote(int[][] vbRegion,
                                      int[] tVotes)
    {
        int i, j;

        for (i = 0; i < tVotes.length; i++)
            for (j = 0; j < vbRegion[0].length; j++)
                tVotes[i] = tVotes[i] + vbRegion[i][j];
    }

    public static void printHeading()
    {
        System.out.println("  ---------------Election Results"
                         + "--------------\n");
        System.out.println("Candidate           "
                         + "       Votes");
        System.out.println("Name       Region1 Region2 "
                         + "Region3 Region4  Total");
        System.out.println("----       ------- ------- "
                         + "------- -------  -----");
    }

    public static void printResults(String[] cNames,
                                    int[][] vbRegion,
                                    int[] tVotes)
    {
        int i, j;
        int largestVotes = 0;
        int winLoc = 0;
        int sumVotes = 0;

        for (i = 0; i < tVotes.length; i++)
        {
            if (largestVotes < tVotes[i])
            {
                largestVotes = tVotes[i];
                winLoc = i;
            }

            sumVotes = sumVotes + tVotes[i];

            System.out.printf("%-11s ", cNames[i]);

            for (j = 0; j < vbRegion[0].length; j++)
                System.out.printf("%6d  ", vbRegion[i][j]);

            System.out.printf("%5d%n", tVotes[i]);
        }

        System.out.println("\n\nWinner: " + cNames[winLoc]
                         + ",  Votes Received: "
                         + tVotes[winLoc]);
        System.out.println("Total votes polled: " + sumVotes);
    }
}
