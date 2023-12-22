import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        // Check sum
        sum = a + b;
        System.out.println(sum);
        scanner.close();
    }
}
