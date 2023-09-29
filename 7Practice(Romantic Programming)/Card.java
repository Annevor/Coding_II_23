public class Card {

    //Fields
    private double moneyBalance;
    private int ticketBalance;
    private int cardNumber;


    //Constructor
    public Card(double moneyBalance, int ticketBalance, int cardNumber){
        this.moneyBalance = moneyBalance;
        this.ticketBalance = ticketBalance;
        this.cardNumber = cardNumber;
    }


    //Getters & Setters
    public double getMoneyBalance() {
        return moneyBalance;
    }


    public void setMoneyBalance(double moneyBalance) {
        this.moneyBalance += moneyBalance;
    }


    public int getTicketBalance() {
        return ticketBalance;
    }


    public void setTicketBalance(int ticketBalance) {
        this.ticketBalance = ticketBalance;
    }


    public int getCardNumber() {
        return cardNumber;
    }


    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}