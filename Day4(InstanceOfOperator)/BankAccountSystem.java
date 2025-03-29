class BankAccount{
 static String bankName = "SBI";
 static int totalAccounts = 0;
 String accountHolderName;
 final String accountNumber;

 BankAccount(String accountHolderName, String accountNumber){ 
 this.accountHolderName = accountHolderName;
 this.accountNumber = accountNumber;
 totalAccounts++;
 }
 void getAccountDetails(){
 System.out.println("Account Holder Name: " + accountHolderName);
 System.out.println("Account NUmber: " + accountNumber);
 }
 static void getTotalAccounts(){
 System.out.println("Number of accounts created: " + totalAccounts);
 }
}

public class BankAccountSystem {
 public static void main(String[] args) {

 BankAccount acc1 = new BankAccount("dinakaran", "234776545342");
 BankAccount acc2 = new BankAccount("BOB", "23498345343");
 System.out.println(acc1 instanceof BankAccount);
 acc1.getAccountDetails();
 BankAccount.getTotalAccounts();
 }
}