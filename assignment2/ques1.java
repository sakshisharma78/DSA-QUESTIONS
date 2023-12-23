import java.util.Scanner;

public class ques1 {

    // Function to check if a number is an Armstrong number
    static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int numberOfDigits = (int) Math.log10(num) + 1;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int startNumber = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int endNumber = scanner.nextInt();

        System.out.println("Armstrong numbers between " + startNumber + " and " + endNumber + ":");
        for (int i = startNumber; i <= endNumber; i++) {
            if (isArmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
