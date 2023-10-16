import java.util.ArrayList;
import java.util.Random;
public class Games {
    private static int gameID = 0;
    private static ArrayList<Games> gameList = new ArrayList<>();
    private static ArrayList<Double> temperatures = new ArrayList<>();
    Random randInt = new Random();
    public Games(){
        gameList.add(this);
    }

    public void playGame(Teams team1, Teams team2, double temperature){
        if(temperature > 32){
            gameID++;
            Teams.setGoalsAllowed((int)(temperature * 0.1));
            team1.setGoals(randInt.nextInt(Teams.getGoalsAllowed()));
            team1.addTotalGoals(team1.getGoals());
            team2.setGoals(randInt.nextInt(Teams.getGoalsAllowed()));
            team2.addTotalGoals(team2.getGoals());
            team2.setPointsAllowed(team1.getGoals());
            team2.setPointsAllowed(team2.getGoals());
            if(team1.getGoals() > team2.getGoals()){
                team1.setWins(team1.getWins() + 1);
                team2.setLosses(team2.getLosses() + 1);
            }
            if(team1.getGoals() < team2.getGoals()){
                team2.setWins(team2.getWins() + 1);
                team1.setLosses(team1.getLosses() + 1);
            }
            if(team1.getGoals() == team2.getGoals()){
                team1.setTies(team1.getTies() + 1);
                team2.setTies(team2.getTies() + 1);
            }
            displayStats(team1, team2);
        } else {
            System.out.println("Game: "+gameID);
            System.out.println("Week was too cold to play. \n" );
        }
    }

    public void displayStats(Teams team1, Teams team2){
        System.out.println("Game: " +Games.getGameID());
        System.out.println("Away Team: " +team2.getName() +", " +team2.getGoals());
        System.out.println("Home Team: " +team1.getName() +", " +team1.getGoals());
        System.out.println("");
    }


    public static double getTemperatures(int i) {
        return temperatures.get(i);
    }
    public static double hottestTemp(){
        double max = 0;
        for(int i = 0; i < Games.temperatures.size(); i++){
            if(Games.getTemperatures(i) > max){
                max = Games.getTemperatures(i);
            }
        }
        return max;
    }
    public static double avgTemp(){
        double total = 0;
        for(int i = 0; i < Games.temperatures.size(); i++){
            total += Games.getTemperatures(i);
        }
        return total / Games.temperatures.size();
    }
    public static ArrayList<Double> printTemps(){
        return temperatures;
    }
    public static int tempSize(){
        return temperatures.size();
    } 

    public static void setTemperatures(double temperatures) {
        Games.temperatures.add(temperatures);
    }
    public static int getGameID() {
        return gameID;
    }
    public static void setGameID(int gameID) {
        Games.gameID = gameID;
    }
}
