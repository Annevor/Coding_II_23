import java.util.Random;
public class Games {
    private String gameName;
    private double gameCost;
    private int winnings;


    //Constructor
    public Games(String gameName, double gameCost){
        this.gameName = gameName;
        this.gameCost = gameCost;
    }


    //Methods
    public void play(Card card){
        Random r = new Random();
        winnings = r.nextInt(100) + 50;

        if(gameCost > card.getMoneyBalance()){
            System.out.println("Game is too expensive. Try a different game.");
        } else {
            card.setMoneyBalance(card.getMoneyBalance() - gameCost);
            card.setTicketBalance(card.getTicketBalance() + winnings);
            System.out.println("Yippee Ki-Yay! " +card + " has won " +winnings + " tickets! New balance: " +card.getTicketBalance());
        }
    }


    //Getters
    public String getGameName() {
        return gameName;
    }

    public double getGameCost() {
        return gameCost;
    }
}