package ATMInterface;
import java.util.Scanner;

public class ATMInterface {

    static double balance = 1000.0;

    public static void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    public static void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== ATM MENU ===== ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount > 0) {
                        deposit(depositAmount);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > 0) {
                        withdraw(withdrawAmount);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

