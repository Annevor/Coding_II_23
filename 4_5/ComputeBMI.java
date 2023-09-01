
import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your weight: "); 
        double weight = sc.nextDouble();
        System.out.print("Please enter your height in inches: ");       
        double height = sc.nextDouble();
        sc.close();
        System.out.print("Your BMI is: " +Math.round((weight / (height * height) * 703)) +"\n");
    }
}
