package Module_2.TeamApp;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
public class Team {
    private String teamName;
    private String[] players;
    private int playerCount;

    //Argument constructor to set the default values to the data fields
    public Team(String teamName)
    {
        this.teamName = teamName; //Setting the team name
        this.players = new String[20]; //Creating an array of size 20 to store the player names
        this.playerCount = 0; //Setting the player count to 0
    }

    //addPlayer method
    public void addPlayer(String player)
    {
        if (playerCount < players.length) { //Checking if the player count is less than the length of the players array
            players[playerCount] = player; //Adding the player to the players array
            playerCount++; //Incrementing the player count
        } else { //If the player count is equal to the length of the players array
            System.out.println("Team is full. Cannot add more players."); //Displaying the message that the team is full
        }
    }

    //Accessor Methods
    public String[] getPlayers() //Accessor method to get the players
    {
        return players; //Returning the players array
    }
    public int getPlayerCount() //Accessor method to get the player count
    {
        return playerCount; //Returning the player count
    }
    public String getTeamName() //Accessor method to get the team name
    {
        return teamName; //Returning the team name
    }
}
