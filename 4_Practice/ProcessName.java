import java.util.Scanner;
public class ProcessName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        sc.close();
        int spaceIdx = name.indexOf(" ");
        String lastName = name.substring(spaceIdx);
        char firstIn = name.charAt(0);
        System.out.println("Your formalized name is: " +lastName +", " +firstIn +".");
    }
}