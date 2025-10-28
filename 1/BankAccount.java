public class BankAccount {
    protected String accountNumber;
    protected String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }

    public void checkBalance() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        balance += balance * interestRate / 100;
    }

    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("12345", "Mark", 1000, 5);
        acc.deposit(500);
        acc.applyInterest();
        acc.checkBalance();
    }
}
