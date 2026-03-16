package lab9;

class BankAccount {

    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdraw: " + amount);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

class CreditAccount extends BankAccount {

    CreditAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

public class Main3 {

    public static void main(String[] args) {

        SavingsAccount acc = new SavingsAccount("111", 1000);

        acc.deposit(200);
        acc.withdraw(100);
    }
}