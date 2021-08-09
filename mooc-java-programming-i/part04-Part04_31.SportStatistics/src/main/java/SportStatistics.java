
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // which file?
        System.out.println("File: ");
        String file = scan.nextLine() ;
        
        // initialise team name, no. games, wins, losses hashmap 
        HashMap<String, ArrayList<Integer>> stats = new HashMap<>();
        
        // if input is null skip code
        boolean isEmpty = false ;
        
        // read file and write to hashmap if team not exists or add game if exists
        try (Scanner openFile = new Scanner(Paths.get(file))) {
            while (openFile.hasNextLine()) {
                
                String input = openFile.nextLine() ;
                        
                if (input.isEmpty()) {
                    isEmpty = true ;
                    break ;
                }
                
                String[] line = input.split(",") ;
                
                // check each team and add to hasmap or append game count
                for (int i=0; i<2; i++) {
                    // if already in hashmap then append game count
                    if (stats.containsKey(line[i])) {
                        // get teamstats 
                        ArrayList<Integer> teamStat = stats.get(line[i]) ;
                        // increase game count by 1
                        teamStat.set(0, teamStat.get(0) + 1) ;
                        // write updated teamstats to hashmap
                        stats.put(line[i], teamStat) ;
                    } else {
                        // write to hash map with new stats
                        stats.put(line[i], new ArrayList<>(Arrays.asList(1,0,0))) ;
                    }
                }
                
                // if home team score is higher they have won
                if (Integer.valueOf(line[2]) > Integer.valueOf(line[3])) {
                    // get winning teams stats
                    ArrayList<Integer> winningTeamStat = stats.get(line[0]) ;
                    // edit the number of wins
                    winningTeamStat.set(1, winningTeamStat.get(1) + 1) ;
                    // edit hasmap with updated stats
                    stats.put(line[0], winningTeamStat) ;
                    
                    // get losing teams stats
                    ArrayList<Integer> losingTeamStat = stats.get(line[1]) ;
                    // edit the number of losses
                    losingTeamStat.set(2, losingTeamStat.get(2) + 1) ;
                    // edit hasmap with updated stats
                    stats.put(line[1], losingTeamStat) ;
                    
                } else if (Integer.valueOf(line[3]) > Integer.valueOf(line[2])) {
                    ArrayList<Integer> winningTeamStat = stats.get(line[1]) ;
                    winningTeamStat.set(1, winningTeamStat.get(1) + 1) ;
                    stats.put(line[1], winningTeamStat) ;
                    
                    ArrayList<Integer> losingTeamStat = stats.get(line[0]) ;
                    losingTeamStat.set(2, losingTeamStat.get(2) + 1) ;
                    stats.put(line[0], losingTeamStat) ;
                    
                } // else {..draw..}
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        if (!isEmpty) {  
            System.out.println("Team: ");
            String team = scan.nextLine() ;
            if (!stats.containsKey(team)){
                System.out.println("Games: 0");
                System.out.println("Wins: 0");
                System.out.println("Losses: 0");
            } else {
                System.out.println("Games: "+stats.get(team).get(0));
                System.out.println("Wins: "+stats.get(team).get(1));
                System.out.println("Losses: "+stats.get(team).get(2));
            }
            
        }
        
    }

}
