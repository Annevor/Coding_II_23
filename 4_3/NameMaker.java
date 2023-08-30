import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class NameMaker {
    
    public static void main(String args[]){
        String firstName;
        String middleName;
        String lastName;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please print your first name: ");
        firstName = sc.next();
        System.out.print("Please print your middle name: ");
        middleName = sc.next();
        System.out.print("Please print your last name: ");
        lastName = sc.next();
        System.out.print("Your full name is " +firstName + " " +middleName + " " +lastName + "\n");
        sc.close();
        System.out.println(firstName.compareTo(middleName));
    }
    
}
