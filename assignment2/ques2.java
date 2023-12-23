import java.util.Scanner;

public class ques2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a string is a palindrome
    static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
