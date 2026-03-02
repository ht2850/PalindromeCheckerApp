class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Racecar";
        String cleanStr = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanStr.isEmpty()) {
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : true");
            return;
        }

        Node head = null;
        Node tail = null;
        for (char ch : cleanStr.toCharArray()) {
            Node newNode = new Node(ch);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }



        Node prev = null;
        Node current = slow;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        Node left = head;
        Node right = prev;
        boolean isPalindrome = true;

        while (right != null) {
            if (left.data != right.data) {
                isPalindrome = false;
                break;
            }
            left = left.next;
            right = right.next;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}