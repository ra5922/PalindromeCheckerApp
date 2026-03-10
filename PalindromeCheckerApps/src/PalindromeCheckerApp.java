import java.util.Stack;

public class PalindromeCheckerApp {

    // Method 1: Two Pointer Approach
    public static boolean checkPalindromeSimple(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack Approach
    public static boolean checkPalindromeStack(String str) {

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

    public static void main(String[] args) {

        String word = "racecar";

        // Measure time for simple method
        long start1 = System.nanoTime();
        boolean result1 = checkPalindromeSimple(word);
        long end1 = System.nanoTime();

        // Measure time for stack method
        long start2 = System.nanoTime();
        boolean result2 = checkPalindromeStack(word);
        long end2 = System.nanoTime();

        System.out.println("Simple Method Result: " + result1);
        System.out.println("Time Taken: " + (end1 - start1) + " ns");

        System.out.println();

        System.out.println("Stack Method Result: " + result2);
        System.out.println("Time Taken: " + (end2 - start2) + " ns");
    }
}