import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        int intVar1 = sc.nextInt();
        int intVar2 = sc.nextInt();
        int intVar3 = sc.nextInt();
        sc.close();
        //Find and print the sum of three integers entered by the user
        System.out.println("Sum of given integers: " +(intVar1 + intVar2 + intVar3));
        
        
        
        //Remember to close the Scanner
        
    }
}
