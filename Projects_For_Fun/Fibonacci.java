import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of desired terms for Fibonacci numbers: ");
        int terms = sc.nextInt();
        long sequence[] = {0L, 1L, 2L};
        for(int i = 1; i <= terms; i++){
            sequence[2] = sequence[1] + sequence[0];
            sequence[0] = sequence[1];
            sequence[1] = sequence[2];
            System.out.println(sequence[1]);
        }
        sc.close();
    }
}