
package soccer;

public class Team {
    
    private String teamName;
    private Player[] playerArray;

    //constructor to set the team name.
    public Team(String teamName) {
        this.teamName = teamName;
    }
    
    //constructor to pass in the array of players
    public Team (String teamName, Player[] players) {
        this(teamName);
        this.playerArray = players;
    }
    
    public Team() {}
    
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayerArray() {
        return playerArray;
    }

    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }
    
}
