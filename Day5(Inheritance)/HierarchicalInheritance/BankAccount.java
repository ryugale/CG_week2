class Bankaccount {
    String accountNumber;
    double balance;
    Bankaccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void displayAccountType() {
        System.out.println("Bank account");
    }
}
class SavingsAccount extends Bankaccount {
    double interestRate;
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("Savings Account");
    }
}
class CheckingAccount extends Bankaccount {
    double withdrawalLimit;
    CheckingAccount(String accountNumber, double balance,
            double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("Checking Account");
    }
}
class FixedDepositAccount extends Bankaccount {
    FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    void displayAccountType() {
        System.out.println("Fixed Deposite Account");
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Bankaccount acc1 = new Bankaccount("1234567890", 2323);
        Bankaccount acc2 = new SavingsAccount("12345567890",234, 12.98);
        Bankaccount acc3 = new CheckingAccount("12345567890",234, 12.98);
        Bankaccount acc4 = new FixedDepositAccount("1234567890", 324);
        acc1.displayAccountType();
        System.out.println();
        acc2.displayAccountType();
        System.out.println();
        acc3.displayAccountType();
        System.out.println();
        acc4.displayAccountType();
    }
}