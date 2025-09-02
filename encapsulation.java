// Class with encapsulation
class BankAccount {
    // private fields
    private String accountNumber;
    private double balance;

    // constructor
    public BankAccount(String accNumber, double initialBalance) {
        this.accountNumber = accNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // getter for account number (read-only)
    public String getAccountNumber() {
        return accountNumber;
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }
}

// Main class to test encapsulation
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC12345", 1000);

        // accessing private data via getters & setters
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Initial Balance: " + acc.getBalance());

        // deposit money
        acc.deposit(500);
        System.out.println("Balance after deposit: " + acc.getBalance());

        // withdraw money
        acc.withdraw(300);
        System.out.println("Balance after withdrawal: " + acc.getBalance());

        // invalid deposit
        acc.deposit(-200);

        // invalid withdrawal
        acc.withdraw(2000);
    }
}
