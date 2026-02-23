import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] charArray = input.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        sc.close();
    }
}
