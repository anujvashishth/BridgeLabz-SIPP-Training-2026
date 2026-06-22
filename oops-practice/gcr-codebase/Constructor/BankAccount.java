class Bank {
    private String accountNumber;
    private String holder;
    private double balance;
    static int totalaccount = 0;
    // Constructor
    Bank(String holder, String accountNumber, double balance) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalaccount++;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holder + " deposited ₹" + amount);
        }
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient balance for " + holder);
        }
    }

    public void getStatement() {
        System.out.println("\nAccount Statement");
        System.out.println("-----------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank acc1 = new Bank("A101", "Anuj", 10000);
        Bank acc2 = new Bank("A102", "Rahul", 15000);
        Bank acc3 = new Bank("A103", "Priya", 20000);

        // 5 Transactions for Account 1
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(12000);

        // 5 Transactions for Account 2
        acc2.deposit(1000);
        acc2.withdraw(2000);
        acc2.deposit(3000);
        acc2.withdraw(5000);
        acc2.deposit(1500);

        // 5 Transactions for Account 3
        acc3.withdraw(4000);
        acc3.deposit(2500);
        acc3.withdraw(1000);
        acc3.deposit(5000);
        acc3.withdraw(3000);

        // Display statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // Total accounts created
        System.out.println("\nTotal Accounts Created: "
                + Bank.totalaccount);
    }
}
