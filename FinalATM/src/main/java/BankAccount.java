public class BankAccount {
    protected static double balance;
        public double getBalance() {
            return BankAccount.balance;
        }

        public void setBalance(double balance) {
            BankAccount.balance = balance;
        }

        public static void deposit(double amount) {
            balance += amount;
            System.out.printf("$%.2f has been deposited into your account\n", amount);
            checkBalance();
        }

        public static void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient funds, please try again");
            } else {
                balance -= amount;
                System.out.printf("$%.2f has been withdrawn from your account\n", amount);
                checkBalance();
            }
        }

        public static void checkBalance() {
            System.out.printf("Your current balance is: $%.2f\n", balance);
        }
    }
