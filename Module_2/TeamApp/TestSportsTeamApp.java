package Module_2.TeamApp;
import java.util.Scanner;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
public class TestSportsTeamApp { //Defining the class TestSportsTeamApp
    public static void main(String[] args) //Defining the main method
    {
        System.out.println("  Welcome to the Sports Team App"); //Displaying the welcome message
        Scanner scan = new Scanner(System.in); //Creating an object of Scanner class
        String continueChoice = "yes"; //Declaring and initializing the variable continueChoice to "yes"

        //Creating a while loop to get the team details from the user
        while (continueChoice.equalsIgnoreCase("yes")) {
        System.out.println("  Enter the team name:"); //Displaying the message to enter the team name
        String teamName = scan.nextLine(); //Reading the team name from the user
        Team team = new Team(teamName); //Creating an object of Team class with the team name


        System.out.println("  Enter the player names: /n hint: use commas for multiple players; no spaces:"); //Displaying the message to enter the player names
        String playerNamesIn = scan.nextLine(); //Reading the player names from the user
        String[] playerNames = playerNamesIn.split(","); // Splitting the player names based on comma and storing them in an array

        //Adding the players to the team
        for(String playerName : playerNames)
        {
            team.addPlayer(playerName); //Adding the player to the team
        }
        System.out.println("  --------Team Summary--------"); //Displaying the team summary
        System.out.println("  Number of players in team "+ team.getTeamName() + " are: " + team.getPlayerCount()); //Displaying the number of players in the team
        System.out.println("  Players on the team " + team.getTeamName()+ " are:"); //Displaying the players in the team
        for(int i = 0; i< team.getPlayerCount(); i++) //Creating a for loop to display the players in the team
        {
            System.out.print(team.getPlayers()[i]); //Displaying the player name
            if (i < team.getPlayerCount() - 1) { //Checking if the player is not the last player
                System.out.print(", ");
            }
        }
        System.out.println(); //Displaying a new line
        System.out.println("  Do you want to enter another team details? (yes/no): "); //Displaying the message to enter another team details
        
        continueChoice = scan.nextLine(); //Reading the choice from the user
    }
    System.out.println("  End of line..."); //Displaying the end of line message
        scan.close(); //Closing the scanner object
    }
}
