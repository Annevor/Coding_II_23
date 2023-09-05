import java.util.Scanner;
public class StringEquality {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter your name: ");
    String name = sc.nextLine();
    if(name.equalsIgnoreCase("Moe")){
        System.out.println("You are the king of Rock and Roll");
    } else {
        System.out.println("You have, due to unfortunate circumstances regarding the namesake of your person, not achieved the status as the King of Rock and Roll");
    }
    sc.close();
   }
}