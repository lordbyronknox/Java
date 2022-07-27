package soccer;

public class League {

    public static void main(String[] args) {
        // TODO code application logic here
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        
        Player[] thePlayers = {player1, player2, player3};
        
        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
        
        //set player1.playerName to "Robert Service".
        //player1.playerName = "Robert Service";
        
        //create team2, create a new Player array, and assign it to the team.
        Team team2 = new Team();
        team2.teamName = "The Reads";
        team2.playerArray = new Player[3];  //Player[] is an attribute of the Team class.
        //add a player with the attribute "Robert Service".
        team2.playerArray[0] = new Player();    //create new player object in team2, index 0.
        team2.playerArray[0].playerName = "Robert Service"; //assign playerName to that object.
        //add two more players
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Paul Nopes";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Vic DaMan";
        
        
        
        //print out the players in the team "The Greens" (team1).
        for (Player i : thePlayers) {
            System.out.println(i.playerName);
        }
       
        //print the player names of team2... "the Reds".
        for (Player i : team2.playerArray) {
            System.out.println(i.playerName);
        }
        
        
        
    }
}







