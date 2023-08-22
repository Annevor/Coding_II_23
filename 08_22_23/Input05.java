import java.util.Scanner;

public class Input05 {
    public static void main(String[] args){
        int intVar = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; ++i){
            intVar += sc.nextInt();
        }
        System.out.println(intVar);
        sc.close();
    }
}
