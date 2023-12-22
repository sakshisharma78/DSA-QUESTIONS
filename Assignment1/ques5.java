import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean continueInput = true;

        System.out.println("Enter numbers (enter 'x' to finish):");

        while (continueInput) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("x")) {
                continueInput = false;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number or 'x' to finish.");
                }
            }
        }

        System.out.println("Sum of entered numbers: " + sum);

        scanner.close();
    }
}
