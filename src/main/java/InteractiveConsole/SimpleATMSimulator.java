package InteractiveConsole;

import java.util.Scanner;

public class SimpleATMSimulator {
    private static double balance = 1000.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nATM Simulator");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }
    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Cannot withdraw more than the available balance.");
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }
    private static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }
}
