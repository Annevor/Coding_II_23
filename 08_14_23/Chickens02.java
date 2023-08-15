public class Chickens02 {
    public static void main(String[] args) {
        int mon = 100;
        int tue = 121;
        int wed = 117;
        double dailyAverage = (mon + tue + wed) / 3.0;
        double monthlyAverage = dailyAverage * 30.0;
        double monthlyProfit = monthlyAverage * 0.18;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
