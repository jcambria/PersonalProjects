import java.util.Scanner;

public class Atm extends BankAccount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // display the menu options
            System.out.println("Welcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exchange Rate");
            System.out.println("5. Exit");

            // prompt the user to select an option
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // perform the selected operation
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double amount = scanner.nextDouble();
                    deposit(amount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    amount = scanner.nextDouble();
                    withdraw(amount);
                    break;
                case 4:
                    exchangeRate();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
    }

    public static void exchangeRate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select currency to exchange to: ");
        System.out.println("1. US Dollar");
        System.out.println("2. Euro");
        System.out.println("3. Japanese Yen");

        int currency = scanner.nextInt();
        double rate = 0.0;

        switch(currency) {
            case 1:
                rate = 1.0;
                break;
            case 2:
                rate = 0.82;
                break;
            case 3:
                rate = 107.74;
                break;
            default:
                System.out.println("Invalid currency selected");
                return;
        }

        System.out.print("Enter the amount to exchange: ");
        double amount = scanner.nextDouble();

        double exchangedAmount = amount * rate;

        System.out.printf("%.2f %s exchanged for %.2f US Dollars\n", amount, getCurrencySymbol(currency), exchangedAmount);
    }

    public static String getCurrencySymbol(int currency) {
        switch(currency) {
            case 1:
                return "USD";
            case 2:
                return "EUR";
            case 3:
                return "JPY";
            default:
                return "";
        }
    }
}

