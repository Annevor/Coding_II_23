import java.util.Scanner;
import java.math.*;
public class SquareRootWhile {
    public static void main(String args[]){
    while(true){
    System.out.print("Type a non-negative integer: ");
    Scanner console = new Scanner(System.in);
	int number = console.nextInt();
    while(number < 0){
            System.out.print("Don't mess with me: ");
            number = console.nextInt();
        }
        if(number > 0){
            double newNum = (double)number;
            System.out.println("The square root of your number is: " + Math.sqrt(newNum));
        }
    console.close();
    }
}
}
