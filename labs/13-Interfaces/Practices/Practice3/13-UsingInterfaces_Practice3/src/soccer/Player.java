
package soccer;

public class Player {
    
    private String playerName;
    private int goalsScored;
    
    public Player(String playerName) {
        this.playerName = playerName;
    }
    
    public Player() {}

    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }
    
    public void incGoalsScored() {
        this.goalsScored++;
    }
}
