
//*************************************************************
// Author: D.S. Malik
//
// This class contains methods for processing voting data for
// student council president's post.
//*************************************************************

import java.util.*;

public class ElectionResult
{
    public static void fillNames(Scanner inFile,
                                 Candidate[] cList,
                                 int numOfCand)
    {
        String firstN;
        String lastN;

        Candidate temp;

        for (int i = 0; i < numOfCand; i++)
        {
            firstN = inFile.next();
            lastN = inFile.next();
            temp  = new Candidate();
            temp.setName(firstN, lastN);
            cList[i] = temp;
        }
    } //end fillNames

       //Insertion sort algorithm.
       //Postcondition: list objects are in ascending order.
    public static void insertionSort(Candidate[] list, int length)
    {
        for (int firstOutOfOrder = 1; firstOutOfOrder < length;
                                      firstOutOfOrder ++)
        {
            Candidate compElem = list[firstOutOfOrder];

            if (compElem.compareTo(list[firstOutOfOrder - 1]) < 0)
            {
                Candidate temp = list[firstOutOfOrder];

                int location = firstOutOfOrder;

                do
                {
                    list[location] = list[location - 1];
                    location--;
                }
                while (location > 0 &&
                       temp.compareTo(list[location - 1]) < 0);

                list[location] = temp;
            }
        }
    }//end insertionSort

       //Binary search algorithm.
       //Precondition: The list must be sorted.
       //Postcondition: If searchItem is found in the list,
       //               it returns the location of searchItem;
       //               otherwise it returns -1.
    public static int binarySearch(Candidate[] list, int length,
                                   Candidate searchItem)
    {
        int first = 0;
        int last = length - 1;
        int mid = 0;

        boolean found = false;

        while (first <= last && !found)
        {
            mid = (first + last) / 2;

            Candidate compElem = list[mid];

            if (compElem.compareTo(searchItem) == 0)
                found = true;
            else if (compElem.compareTo(searchItem) > 0)
                last = mid - 1;
            else
                first = mid + 1;
        }

        if (!found)
            mid = -1;

        return mid;
    }//end binarySearch

    public static void processVotes(Scanner inFile,
                                    Candidate[] cList)
    {
        String firstN;
        String lastN;
        int region;
        int votes;
        int candLocation;

        Candidate temp;

        while (inFile.hasNext())
        {
            firstN = inFile.next();
            lastN = inFile.next();
            region = inFile.nextInt();
            votes = inFile.nextInt();

            temp = new Candidate();
            temp.setName(firstN, lastN);
            temp.setVotes(region, votes);

            candLocation = binarySearch(cList, 6, temp);

            if (candLocation != -1)
            {
                temp = cList[candLocation];
                temp.updateVotesByRegion(region, votes);
            }
        }
    } //end processVotes

    public static void addVotes(Candidate[] cList,
                                int numOfCand)
    {
        Candidate temp;

        for (int i = 0; i < numOfCand; i++)
            cList[i].calculateTotalVotes();
    } //end addVotes

    public static void printHeading()
    {
        System.out.println("--------------------Election Results"
                         + "-----------------\n");
        System.out.println("                         "
                         + "Votes By Region");
        System.out.println("Candidate Name  Rgn#1 \tRgn#2 \t"
                         + "Rgn#3 \tRgn#4 \tTotal");
        System.out.println("--------------  ----- \t----- "
                         + "\t----- \t----- \t-----");
    } //end printHeading

    public static void printResults(Candidate[] cList,
                                    int numOfCand)
    {
        int largestVotes = 0;
        int sumVotes = 0;
        int winLoc = 0;

        for (int i = 0; i < numOfCand; i++)
        {
            cList[i].printData();

            sumVotes = sumVotes + cList[i].getTotalVotes();

            if (largestVotes < cList[i].getTotalVotes())
            {
                largestVotes = cList[i].getTotalVotes();
                winLoc = i;
            }
        }

        System.out.print("\nWinner: ");
        System.out.print(cList[winLoc].getFirstName() + " "
                       + cList[winLoc].getLastName());
        System.out.println(", Votes Received: "
                       + cList[winLoc].getTotalVotes());
        System.out.println("\nTotal votes polled: " + sumVotes);
    } //end printResults
}