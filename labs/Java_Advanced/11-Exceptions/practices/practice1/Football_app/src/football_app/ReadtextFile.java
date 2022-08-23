/*

 */
package football_app;

import java.util.*;

public class ReadtextFile {


    public static void main(String[] args) 
    {
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("Man 2");
        arr1.add("liver 9");
        arr1.add("spurs 6");
        arr1.add("Hove 5");



        String hold;
        
        for (int i = 0; i < arr1.size(); ++i)
        {
            for(int j = 0; j < arr1.size(); ++j)
            {
                String team_i = (arr1.get(i));
                int points_i = Integer.parseInt(team_i.substring(team_i.length() - 1));
                String team_j = (arr1.get(j));
                int points_j = Integer.parseInt(team_j.substring(team_j.length() - 1));
                
                if (points_i > points_j)
                {
                    hold = team_i;
                    arr1.set(i, team_j);
                    arr1.set(j, hold);
                    System.out.println(arr1);
                }
                    
              }
        }
        System.out.println(arr1);
    }
}
