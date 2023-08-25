public class Calculator4 {
    public double tax = 1.05;
    public double tip = 1.15;
    
    public double findTotal(double price, String name){
        double total = price*tax*tip;
        System.out.println(name +" owes $" +total);
        return total;
    }
}
