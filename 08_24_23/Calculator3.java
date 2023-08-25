public class Calculator3 {
    public double tax = 1.05;
    public double tip = 1.15;
    
    public void findTotal(double price, String name){
        double total = price*tax*tip;
        System.out.println(name +" owes $" +total);

    }
}
