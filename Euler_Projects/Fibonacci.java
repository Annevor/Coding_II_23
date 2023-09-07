import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of desired terms for Fibonacci numbers: ");
        int terms = sc.nextInt();
        sc.close();
        long fib[] = {0L, 1L, 2L};        // first three terms of Fibonacci
        for(int i = 0; i < terms; i++){
            fib[2] = fib[1] + fib[0];     // reassigning of third term in the list
            fib[0] = fib[1];              // memory shift to the left; reassigning first term with second
            fib[1] = fib[2];              // further shift; reassigning second term with third; loop reiterates
            System.out.println(fib[1]);
        }
    }
}