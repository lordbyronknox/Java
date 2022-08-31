
package football_app;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
 
public class FootballApp {
    // include throws to handle some file handling exceptions
    public static void main(String[] args) throws IOException
    {
        // arraylist to store strings
        List<String> listOfStrings = new ArrayList<String>();
        //HaspMap to hold unique teams
        HashMap log = new HashMap();
       
        // load content of file based on specific delimiter
        Scanner sc = new Scanner(new FileReader("C:\\Users\\byron\\Desktop\\Java\\Java\\labs\\Java_Advanced\\11-Exceptions\\practices\\practice1\\Football_app\\src\\football_app\\scores.txt"))
                         .useDelimiter(",\\s*");
       
        String str;
        while (sc.hasNext()) {                              // checking for end of file.
            str = sc.next();                                //assign each line to variable 'str'.
            listOfStrings.add(str);                         //adding each str to arraylist 'listOfStrings'
 
            //extract team name and add it to 'log'.
            String teamName = str.substring(0, (str.length() -2));
            log.put(teamName.trim(), 0);
        }       

        // convert any arraylist to array
        String[] array = listOfStrings.toArray(new String[0]);
     
        //print each game with scores, and calculate the points
        int team1 = 0;
        int team2 = 1;
        while (team2 < array.length) {
            String[] team1ANDgoals = array[team1].split(" ");                       
            String[] team2ANDgoals = array[team2].split(" ");
        
            System.out.println("Game: " + array[team1] + " vs " + array[team2]);
            team1 += 2;
            team2 += 2;
                      
            if (Integer.parseInt(team1ANDgoals[1]) > Integer.parseInt(team2ANDgoals[1])) {
                System.out.println(team1ANDgoals[0] + " WON!!\n");
                log.put(team1ANDgoals[0], (Integer) log.get(team1ANDgoals[0]) + 3);
              }
            else if (Integer.parseInt(team1ANDgoals[1]) < Integer.parseInt(team2ANDgoals[1])) {
                System.out.println(team2ANDgoals[0] + " WON!!\n");
                log.put(team2ANDgoals[0], (Integer) log.get(team2ANDgoals[0]) + 3); 
            }
            else {
                System.out.println("DRAW\n");
                log.put(team1ANDgoals[0], (Integer) log.get(team1ANDgoals[0]) + 1);
                log.put(team2ANDgoals[0], (Integer) log.get(team2ANDgoals[0]) + 1); 
            }            
        }
        
    //loop through Hashmap 'log' and add elements to ArrayList 'log2', and sort.
    ArrayList<String> log2 = new ArrayList();
    for(Object element : log.entrySet()){
         log2.add(element + "");
     }

    String hold;        
    for (int i = 0; i < log2.size(); ++i) {
        for(int j = 0; j < log2.size(); ++j) {
            String team_i = (log2.get(i));
            int points_i = Integer.parseInt(team_i.substring(team_i.length() - 1));
            String team_j = (log2.get(j));
            int points_j = Integer.parseInt(team_j.substring(team_j.length() - 1));

            if (points_i > points_j) {
                hold = team_i;
                log2.set(i, team_j);
                log2.set(j, hold);
                }
        }
    }
    //Print league log and points to console.
    for (int i = 0; i < log2.size(); ++i){
        System.out.println((i + 1) + ". " + (log2.get(i).split("=")[0]) + "\n" + (log2.get(i).split("=")[1]));
    }
  }    
}