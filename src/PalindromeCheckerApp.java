import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "refer";

        String cleanStr = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : cleanStr.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        if (!cleanStr.isEmpty()) {
            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    isPalindrome = false;
                    break;
                }
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}