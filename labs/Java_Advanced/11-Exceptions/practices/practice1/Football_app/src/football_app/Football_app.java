/*

 */
package football_app;


import java.io.FileReader;
import java.io.IOException;
import java.util.*;
 
public class Football_app {
    // include throws to handle some file handling exceptions
    public static void main(String[] args) throws IOException
    {
        // arraylist to store strings
        List<String> listOfStrings = new ArrayList<String>();
        HashMap log = new HashMap();
       
        // load content of file based on specific delimiter
        Scanner sc = new Scanner(new FileReader("C:\\Users\\byron\\Desktop\\Java\\Java\\labs\\Java_Advanced\\11-Exceptions\\practices\\practice1\\Football_app\\src\\football_app\\scores.txt"))
                         .useDelimiter(",\\s*");
        
        
System.out.println("----------------");
        
        String str;
           
        while (sc.hasNext())                                // checking for end of file.
        {
            str = sc.next();                                //assign each line to variable 'str'.
            listOfStrings.add(str);                         //adding each str to arraylist 'listOfStrings'
            //extract team name and add it to HashMap 'log'.
            String teamName = str.substring(0, (str.length() -2));
            log.put(teamName.trim(), 0);
        }
                     
        // convert any arraylist to array
        String[] array = listOfStrings.toArray(new String[0]);
       
               
        //print each game with scores.
        int team1 = 0;
        int team2 = 1;
        while (team2 < array.length)
        {
            String[] team1ANDgoals = array[team1].split(" ");
            String[] team2ANDgoals = array[team2].split(" ");
            
            System.out.println("Game: " + array[team1] + " vs " + array[team2]);
            team1 += 2;
            team2 += 2;
            
         
            
                      
            if (Integer.parseInt(team1ANDgoals[1]) > Integer.parseInt(team2ANDgoals[1])) 
            {
                System.out.println(team1ANDgoals[0] + " WON!!" + "\n");
                log.put(team1ANDgoals[0], (team1ANDgoals[1] + 3)); 
            }
            else if (Integer.parseInt(team1ANDgoals[1]) < Integer.parseInt(team2ANDgoals[1])) 
            {
                System.out.println(team2ANDgoals[0] + " WON!!" + "\n");
                log.put(team2ANDgoals[0], 3); 
            }
            else {
                System.out.println("DRAW" + "\n");
                log.put(team1ANDgoals[0], 1); 
                log.put(team2ANDgoals[0], 1); 
            }
            System.out.println(team1ANDgoals[1]);
        }
          
          System.out.println(log);
}
   
}