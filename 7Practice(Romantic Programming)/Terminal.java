public class Terminal {

    //Fields
    private Card card;


    //Constructor
    public Terminal(Card card){
        this.card = card;
    }


    //Methods
    public void updateBalance(int send){
        card.setMoneyBalance(send * 2);
    }

    public void transfer(Card sender, Card receiver, int send){
        if(sender.getMoneyBalance() >= send){
            sender.setMoneyBalance(sender.getMoneyBalance() - send);
            receiver.setMoneyBalance(receiver.getMoneyBalance() + send);
            System.out.println(sender +" has sent " +send +" credits to " +receiver +". The new balance of " +receiver +" is " +receiver.getMoneyBalance() + " and the new balance of " +sender +" is " +sender.getMoneyBalance());
        }
    }

    public void getPrize(Card card, Prizes prize){
        if(prize.getCost() <= card.getTicketBalance() && prize.getStock() > 0){
            card.setTicketBalance(card.getTicketBalance() - prize.getCost());
            System.out.println(card + "has won the " +prize.getName() + "\n" + prize.getDescription());
            prize.setStock(prize.getStock() - 1);
            System.out.println("There are now " +prize.getStock() + " " + prize.getName() + " left in stock.");
        } else {
            System.out.println(card +"is too poor for this prize. Try a different prize");
        }
    }
}