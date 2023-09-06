import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        double rating = 7.8;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the movie ticket price: ");
        double price = sc.nextDouble();
        if((price >= 12.0) && (rating >= 5.0)){
            System.out.println("I am interested in watching this stupid movie!!");
        } else {
            System.out.println("36.44\u00B0N   86.65\u00B0W");
        }
        sc.close();
    }
}
