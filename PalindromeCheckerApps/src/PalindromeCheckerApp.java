

import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

    // Strategy Interface
    interface PalindromeStrategy {
        boolean checkPalindrome(String str);
    }

    // Stack Strategy
    class StackStrategy implements PalindromeStrategy {

        public boolean checkPalindrome(String str) {
            Stack<Character> stack = new Stack<>();

            for (char c : str.toCharArray()) {
                stack.push(c);
            }

            for (char c : str.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }
            return true;
        }
    }

    // Deque Strategy
    class DequeStrategy implements PalindromeStrategy {

        public boolean checkPalindrome(String str) {
            Deque<Character> deque = new ArrayDeque<>();

            for (char c : str.toCharArray()) {
                deque.addLast(c);
            }

            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }
            return true;
        }
    }

    // Context Class
    class PalindromeChecker {

        private PalindromeStrategy strategy;

        public PalindromeChecker(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean check(String str) {
            return strategy.checkPalindrome(str);
        }
    }

    // Main Class
    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            String word = "madam";

            // Choose strategy dynamically
            PalindromeChecker checker = new PalindromeChecker(new StackStrategy());
            // PalindromeChecker checker = new PalindromeChecker(new DequeStrategy());

            if (checker.check(word)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }
    }
