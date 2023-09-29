package Midterm;
import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter desired number to print times table: ");
        int request = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(request + " X " +i +" = " +request * i);
        }
        sc.close();
    }
}
