import java.util.ArrayList;
public class Teams {
    public static ArrayList<Teams> teamList= new ArrayList<>();
    private String name;
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;
    private int goals = 0;
    private ArrayList<Integer> totalGoals = new ArrayList<>();
    private static int goalsAllowed;
    private int pointsAllowed = 0;
    

    public Teams(String name){
        this.name = name;
        teamList.add(this);
    }

    public static void displayStats(Teams team){
        System.out.println(team.name);
        System.out.println("Wins: " +team.wins +", Losses: " +team.losses +", Ties: " +team.ties);
        System.out.println("Points scored: " +team.getTotalGoals() +", Points allowed: " +team.pointsAllowed +"\n\n ---------- \n");
    }

    public ArrayList<Teams> getTeamList(){
        return teamList;
    }

    public String getName() {
        return name;
    }
    public int getWins() {
        return wins;
    }
    public int getLosses() {
        return losses;
    }
    public int getTies() {
        return ties;
    }
    public int getGoals() {
        return goals;
    }
    public static int getGoalsAllowed() {
        return goalsAllowed;
    }
    public int getTotalGoals(){
        int temp = 0;
        for(int i = 0; i < totalGoals.size(); i++){
            temp += totalGoals.get(i);
        }
        return temp;
    }


    public int getPointsAllowed() {
        return pointsAllowed;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public static void setGoalsAllowed(int goalsAllowed) {
        Teams.goalsAllowed = goalsAllowed;
    }

    public void setPointsAllowed(int pointsAllowed) {
        this.pointsAllowed = pointsAllowed;
    }
    public void addTotalGoals(int goals){
        totalGoals.add(goals);
    }
}
