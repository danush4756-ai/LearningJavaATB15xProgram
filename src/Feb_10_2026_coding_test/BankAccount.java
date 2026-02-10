package Feb_10_2026_coding_test;

public class BankAccount {
        private double balance;
        // constructor
        public BankAccount(double initialBalance) {
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                System.out.println("Initial balance cannot be negative");
                this.balance = 0;
            }
        }
        // deposit method
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive");
            }
        }
        // withdraw method
        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive");
            } else if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            }
        }
        // getter method
        public double getBalance() {
            return balance;
        }
        public static void main(String[] args) {
            BankAccount account = new BankAccount(5000);
            account.deposit(2000);
            account.withdraw(3000);
            account.withdraw(6000); // Insufficient balance
            account.deposit(-500);  // Deposit amount should be positive
            System.out.println("Current Balance: " + account.getBalance());
        }
    }

