import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner();

public class Hangman
{
    private static final String Game = null;

    public static void main(final String[] array) {
        final Scanner scanner = new Scanner(System.in);
        for (int i = 1; i != 0; i = 0) {
            System.out.println("Howdy! Welcome to Hangman!");
            System.out.println("Can you guess the word? You have 6 tries!");
            int j = 1;
            int n = 6;
            String word = "";
            final ArrayList<Character> list = new ArrayList<Character>();
            try {
                word = getWord();
            }
            catch (Exception ex) {
                System.out.println("Game failed to load.");
                j = 0;
            }
            while (j != 0) {
                Game.printGallows(n);
                System.out.println(word);
                final String x = "";
                int n2 = 0;
                for (int k = 0; k < word.length(); ++k) {
                    boolean b = false;
                    final Iterator<Object> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next() == word.charAt(k)) {
                            b = true;
                            ++n2;
                        }
                    }
                    if (b) {
                        System.out.print(invokedynamic(makeConcatWithConstants:(C)Ljava/lang/String;, word.charAt(k)));
                    }
                    else {
                        System.out.print("_ ");
                    }
                }
                System.out.println(x);
                String s = "";
                for (int l = 0; l < list.size(); ++l) {
                    s = invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;, s, list.get(l));
                }
                System.out.println(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, s));
                char ch;
                for (ch = Character.toUpperCase(scanner.nextLine().charAt(0)); list.contains(ch); ch = Character.toUpperCase(scanner.nextLine().charAt(0))) {
                    System.out.println(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, s));
                }
                list.add(ch);
                if (word.indexOf(ch) == -1) {
                    --n;
                }
                if (n == 0 || n2 == word.length() - 1) {
                    System.out.println("You've been hanged, partner!");
                    j = 0;
                }
            }
            System.out.println("Play again? Y / N");
            String s2;
            for (s2 = scanner.nextLine(); !s2.equals("N") && !s2.equals("Y"); s2 = scanner.nextLine()) {
                System.out.println("That's not a valid response, ya goose! Type 'Y' or 'N'.");
            }
            if (s2.equals("N")) {}
        }
        scanner.close();
    }
}