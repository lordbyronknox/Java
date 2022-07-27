package soccer;

import utility.GameUtils;

public class Game {

    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;

    /* Practice 8-2. Add playGame() method here */
    public void playGame() {
        int numberOfGoals = (int) (Math.random() * 7);
        Goal[] theGoals = new Goal[numberOfGoals];
        this.goals = theGoals;
        GameUtils.addGameGoals(this);
    }

    /* Practice 8-2. Add getDescription() method here */
    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal : this.goals) {
            returnString.append("Goal scored after "
                    + currGoal.theTime + " mins by "
                    + currGoal.thePlayer.playerName + " of "
                    + currGoal.theTeam.teamName + "\n");
        }
        return returnString.toString();
    }
}
