import java.util.Scanner;
public class BetterSwitch{
    public static void main(String[] args) {
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "Ocbober", "November", "December"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Month: ");
        int month = sc.nextInt();
        System.out.println(months[month]);
        sc.close();
    }
}