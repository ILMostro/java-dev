
//***************************************************************
// Author: D.S. Malik
//
// This program processes voting data for student council
// president's post. It lists each candidate's name and the votes
// they received. The name of the winner is also is printed.
//***************************************************************

import java.io.*;
import java.util.*;

public class TestProgElectionResult
{
    static final int NO_OF_CANDIDATES = 6;

    public static void main(String[] args) throws
                                        FileNotFoundException
    {
        Candidate[] candidateList =
                           new Candidate[NO_OF_CANDIDATES];

        Candidate temp;

        Scanner inFile = new Scanner
                     (new FileReader("candData.txt"));

        ElectionResult.fillNames(inFile, candidateList,
                                 NO_OF_CANDIDATES);

        ElectionResult.insertionSort(candidateList,
                                     NO_OF_CANDIDATES);

        inFile = null;

        inFile = new Scanner(new FileReader("voteData.txt"));

        ElectionResult.processVotes(inFile, candidateList);

        ElectionResult.addVotes(candidateList,
                                NO_OF_CANDIDATES);

        ElectionResult.printHeading();
        ElectionResult.printResults(candidateList,
                                    NO_OF_CANDIDATES);
    } // end main
}