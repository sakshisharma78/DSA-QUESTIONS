import java.util.Scanner;

public class ques4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in rupees: ");
        double rupees = scanner.nextDouble();

        System.out.print("Enter the exchange rate (1 USD to INR): ");
        double exchangeRate = scanner.nextDouble();

        double usd = convertToUSD(rupees, exchangeRate);

        System.out.println("Equivalent amount in USD: $" + usd);

        scanner.close();
    }

    // Function to convert rupees to USD
    static double convertToUSD(double rupees, double exchangeRate) {
        return rupees / exchangeRate;
    }
}
