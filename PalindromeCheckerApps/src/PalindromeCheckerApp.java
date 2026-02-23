import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        String s = sc.nextLine();
        int n = s.length();
        boolean a = true;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                a = false;
                System.out.println(s + " is not a palindrome");
                break;
            }
        }
        if (a) {
            System.out.println(s + " is a palindrome");
        }
    }
}