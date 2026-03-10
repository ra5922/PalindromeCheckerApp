public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {

        // Convert to lowercase
        str = str.toLowerCase();

        // Remove spaces
        str = str.replaceAll("\\s+", "");

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

    public static void main(String[] args) {

        String input = "Never Odd Or Even";

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}