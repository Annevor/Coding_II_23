import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
Scanner console = new Scanner(System.in);
int sum = 0;
System.out.println("Enter a number (-1 to quit): ");
int num = console.nextInt();
while (num != -1) {
sum = sum + num;
System.out.println("Enter a number (-1 to quit): ");
num = console.nextInt();
console.close();
}//end while
System.out.println("The sum is " + sum);
}//end method main
}