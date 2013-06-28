//************************************************************
// Author: D.S. Malik
//
// This class implements a candidate as an object.
//************************************************************

public class Candidate
{
    private final int NO_OF_REGIONS = 4;

    private String firstName;
    private String lastName;

    private int[] votesByRegion;
    private int totalVotes;

       //Default constructor
       //Postcondition: firstName = " "; lastName = " "
	   //               Creates the array votesByRegion and
       //               sets totalVotes to zero.
    Candidate()
    {
        firstName = "";
       	lastName = "";
        totalVotes = 0;
        votesByRegion = new int[NO_OF_REGIONS];
    }

	   //Method to set firstName and lastName according to
 	   //the parameters
	   //Postcondition: firstName = first; lastName = last;
    public void setName(String first, String last)
    {
         firstName = first;
         lastName = last;
    }

      	//Method to return the firstName
	    //Postcondition: the value of firstName is returned
    public String getFirstName()
    {
        return firstName;
    }

      	//Method to return the lastName
	    //Postcondition: the value of lastName is returned
    public String getLastName()
    {
        return lastName;
    }

       //Method to set the votes of a candidate for a
       //particular region.
       //Postcondition: The votes specified by the parameter
       //               votes are assigned to the region
       //               specified by the parameter region.
    public void setVotes(int region, int votes)
    {
        votesByRegion[region - 1] = votes;
    }

       //Method to update the votes of a candidate for a
       //particular region.
       //Postcondition: The votes specified by the parameter votes
       //               are added to the region specified by the
       //               parameter region.
    public void updateVotesByRegion(int region, int votes)
    {
        votesByRegion[region - 1] = votesByRegion[region - 1]
                                    + votes;
    }

       //Method to calculate the total votes received by a
       //candidate.
       //Postcondition: The votes received in each region are added.
    public void calculateTotalVotes()
    {
        totalVotes = 0;

        for (int i = 0; i < NO_OF_REGIONS; i++)
            totalVotes += votesByRegion[i];
    }

       //Method to return the total votes received by a
       //candidate.
       //Postcondition: The total votes received by the candidate
       //               are returned.
    public int getTotalVotes()
    {
        return totalVotes;
    }

       // Method to output the candidate’s name, the votes
       //received in each region, and the total votes received.
    public void printData()
    {
        System.out.printf("%-14s ", firstName + " " + lastName);

        for (int i = 0; i < NO_OF_REGIONS; i++)
             System.out.printf("%6d  ", votesByRegion[i]);

        System.out.printf("%5d%n", totalVotes);
    }

       //Method to determine if two candidates have the same
       //name.
       //Postcondition: Returns true if the name of this
       //               candidate is the same as the name of
       //               the candidate specified by the parameter
       //               otherCan.
    public boolean equals(Candidate otherCan)
    {
        return (firstName.equals(otherCan.firstName)
               && lastName.equals(otherCan.lastName));
    }

       //Method to compare the names of two candidates.
       //Postcondition: Returns 0 if the name of this
       //               candidate is the same as the name of
       //               otherCan; returns < 0 if the name of
       //               this candidate is less then the name
       //               of otherCan; returns > 0 if the name
       //               of this candidate is greater than the
       //               name of otherCan.
    public int compareTo(Candidate otherCan)
    {
        if (lastName.equals(otherCan.lastName))
            return(firstName.compareTo(otherCan.firstName));
        else
            return(lastName.compareTo(otherCan.lastName));
    }
}