import java.util.ArrayList;

class Account {
    private String accountNumber;
    private String holderName;
    private double balance;

    public Account(String accountNumber, String holderName, double balance) {
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

    public void displayInfo() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }
}

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void displayAccounts() {
        for (Account acc : accounts) acc.displayInfo();
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account a1 = new Account("001", "John", 1000);
        Account a2 = new Account("002", "Mary", 2000);
        bank.addAccount(a1);
        bank.addAccount(a2);
        a1.deposit(500);
        a2.withdraw(300);
        bank.displayAccounts();
    }
}
