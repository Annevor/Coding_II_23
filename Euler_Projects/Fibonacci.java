import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of desired terms for Fibonacci numbers: ");
        int terms = sc.nextInt();
        sc.close();
        long fib[] = {0L, 1L, 2L};
        for(int i = 1; i <= terms; i++){
            fib[2] = fib[1] + fib[0];
            fib[0] = fib[1];
            fib[1] = fib[2];
            System.out.println(fib[1]);
        }
    }
}