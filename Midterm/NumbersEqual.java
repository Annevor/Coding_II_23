package Midterm;
import java.util.Scanner;

public class NumbersEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[4];
        for(int i = 0; i < 4; i++){
            System.out.print("Gimme a number, joe: ");
            list[i] = sc.nextInt();
        }
        if(list[0] == list[1] && list[1] == list[2] && list[2] == list[3]){
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("not equal, joe");
        }
        sc.close();
    }
}
