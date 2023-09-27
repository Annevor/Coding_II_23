import java.util.Scanner;
public class StringTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringProject stats = new StringProject("Was it a cat I saw?");
        System.out.println("Current string: " + stats);
        stats.reverseCase();
        System.out.println("Number of times 'a' appears: " + stats.characterCount('a'));
        stats.reverseString();
        System.out.println("Each word on a line: \n" +stats.eachWordOnALine());
        System.out.println("Number of words in the String: " + stats.wordCount());
        System.out.println("Number of characters in the String: " + stats.characterCount());
        System.out.println("Average word length in the String: " + stats.avgWordLength());
        System.out.println("Number of vowels in the String: " + stats.vowelCount());
        System.out.println("Number of times that the substring 's' occurs in the String: " +stats.substrCount('s'));
        System.out.println("is Palindrome: " + stats.isPalindrome());
        System.out.println("");
        System.out.print("Enter a string: ");
        StringProject stats2 = new StringProject(sc.nextLine());
        stats2.reverseString();
        System.out.println("Is \"" + stats2 + "\" a Palindrome?: " +stats2.isPalindrome());
        sc.close();
    }
}