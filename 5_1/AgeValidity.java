import java.util.Scanner;
public class AgeValidity {
    public static void main(String[] args) {
        String[] options = {"", "not "};
        int i = 0;
        boolean drivingUnderAge;
        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you? : ");
        int age = sc.nextInt();
        drivingUnderAge = age <= 18;
        sc.close();
        if(drivingUnderAge == true){
            i = 0;
        } else {
            i = 1;
        }
        System.out.println("This person is " + options[i] + "driving under age");
    }
}
