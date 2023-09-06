import java.util.Scanner;
public class TrafficLightSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter either 1, 2, or 3: ");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("The traffic light is red!");
                break;
            case 2:
                System.out.println("The light is yellow!");
                break;
            case 3:
                System.out.println("The light is green! GO GO GO!");
                break;
            default: 
                System.out.println("36.44\u00B0N   86.65\u00B0W");
        }
        sc.close();
    }
}
