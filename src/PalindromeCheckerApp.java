//public class PalindromeCheckerApp {
//    public static void main (String[] args) {
//        System.out.println("Welcome to the Palindrome Checker Management System");
//        System.out.println("Version : 1.0");
//        System.out.println("System initialized successfully.");
//    }
//}

public class PalindromeCheckerApp {
    public static void main (String[] args) {
        String input = "madam";

        System.out.println("Input text : " + input);

        Boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}