import java.util.Scanner;
public class ComputeFare {
    public static void main(String args[]) {
        System.out.print("Enter the age: ");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        int fare;
        if(age < 11){
            fare = 3;
        } else if(age < 65){
            fare = 5;
        } else {
            fare = 3;
        }
        System.out.println("The fare will cost $" +fare +".");
        keyboard.close();
    }
}
