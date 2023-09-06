import java.util.Scanner;
public class TrafficLightChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 1, 2, or 3: ");
        int n = sc.nextInt();
        if(n == 1){
            System.out.println("The light's red.");
        } else if(n == 2){
            System.out.println("The light is yellow.. like the sun");
        } else if(n == 3){
            System.out.println("The light is green. pedal to the metal slow poke.");
        } else {
            System.out.println(":(");
        }
        sc.close();
    }
}
