
package Page405UsingJaggedArrays;

/**
 *
 * @author byron
 */
public class Team {
    public static void main(String[] args) 
    {
        String[][] teams = {
            {"Henry Blake", "Johnny Mulcahy"},
            {"Benjamin Pierce", "John McIntyre", "Jonathan Tuttle"},
            {"Margaret Houlihan", "Frank Burns"},
            {"Max Klinger", "Radar O'Reilly", "Igor Straminsky"}
        };
        
        for (int i = 0; i < teams.length; i++)
        {
//          for (String team : teams[i]) 
            for (int j = 0; j < teams[i].length; j++) //inner loops iterates through each element of teams
            {
                // the array.
                System.out.println(teams[i][j]);
            }
            System.out.println();
        }
        
        
        System.out.println("**************using advanced for loop**************");
        
        
        for (String[] team : teams) {
                for (String player : team) {
                System.out.println(player);
                }
        System.out.println();
    }
    }   
}
