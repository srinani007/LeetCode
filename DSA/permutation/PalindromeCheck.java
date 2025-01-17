package permutation;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String n = scan.nextLine();

        boolean result = isPalindrome(n);

        if (result) {
            System.out.println("The string \"" + n + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + n + "\" is not a palindrome.");
        }

        scan.close();
    }  

    public static boolean isPalindrome(String input) {
        if (input == null || input.length() == 0) { 
            return false;
        } 
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return IntStream.range(0, cleaned.length() / 2)
        .allMatch(i -> cleaned.charAt(i) == cleaned.charAt(cleaned.length() - i - 1));
    }
}
