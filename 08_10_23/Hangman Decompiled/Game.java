import java.io.FileNotFoundException;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Game
{
    public static String getWord() throws FileNotFoundException {
        final Scanner scanner = new Scanner(new File("sowpods.txt"));
        final ArrayList<String> list = new ArrayList<String>();
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
        scanner.close();
        return list.get(new Random().nextInt(list.size()));
    }
    
    public static void printGallows(final int n) {
        System.out.println("    _____  ");
        System.out.println("    |    | ");
        if (n < 6) {
            System.out.println("    O    |");
        }
        else {
            System.out.println("         | ");
        }
        if (n < 3) {
            System.out.println("   /|\\   | ");
        }
        else if (n < 4) {
            System.out.println("   /|    | ");
        }
        else if (n < 5) {
            System.out.println("    |    | ");
        }
        else {
            System.out.println("         | ");
        }
        if (n == 1) {
            System.out.println("   /     | ");
        }
        else if (n == 0) {
            System.out.println("   / \\   | ");
        }
        else {
            System.out.println("         | ");
        }
        System.out.println("       ----- ");
    }
}