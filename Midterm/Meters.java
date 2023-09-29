package Midterm;
import java.util.Scanner;

public class Meters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a measurement in inches: ");
        double inches = sc.nextDouble();
        System.out.println(inches +" inches  is " +(inches * 0.0254) +" meters.");
        sc.close();
    }
}
