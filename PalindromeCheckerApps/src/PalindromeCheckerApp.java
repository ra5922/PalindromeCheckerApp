public class PalindromeCheckerApp {

    // Method to check palindrome
    public boolean checkPalindrome(String str) {

        str = str.toLowerCase();
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

        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        String word = "level";

        if (checker.checkPalindrome(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

