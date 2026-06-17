package CurrencyConverter;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double amount;
        double result;

        do {
            System.out.println("\n===== Currency Converter ===== ");
            System.out.println("1. INR to USD");
            System.out.println("2. USD to INR");
            System.out.println("3. INR to EUR");
            System.out.println("4. EUR to INR");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount in INR: ");
                    amount = sc.nextDouble();
                    result = amount / 86.0;
                    System.out.printf("USD: %.2f%n", result);
                    break;

                case 2:
                    System.out.print("Enter amount in USD: ");
                    amount = sc.nextDouble();
                    result = amount * 86.0;
                    System.out.printf("INR: %.2f%n", result);
                    break;

                case 3:
                    System.out.print("Enter amount in INR: ");
                    amount = sc.nextDouble();
                    result = amount / 98.0;
                    System.out.printf("EUR: %.2f%n", result);
                    break;

                case 4:
                    System.out.print("Enter amount in EUR: ");
                    amount = sc.nextDouble();
                    result = amount * 98.0;
                    System.out.printf("INR: %.2f%n", result);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
