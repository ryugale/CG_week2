class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;
 
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
 
    public void getBalance(){
        System.out.println("Balance: " +  balance);
    }

    public void updateBalance(double balance){
        this.balance = balance;
    }
   
 }
 class SavingsAccount extends BankAccount{
    SavingsAccount(int accountNumber, String accountHolder, double balance){
        super(accountNumber, accountHolder, balance);
    }
 
    void getAccNumber(){
        System.out.println("Account number: " +  accountNumber);
    }

    void getAccHolder(){
        System.out.println("Account holder: " +  accountHolder);
    }
 }
 public class BankManagementSystem {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(362, "Jawahar", 100000);
        acc.getAccHolder();
        acc.getAccNumber();
     
    }
 }