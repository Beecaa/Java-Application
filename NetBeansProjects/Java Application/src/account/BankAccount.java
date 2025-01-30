
package account;


public class BankAccount {
     private String accountNumber;
    private double balance;
    private String accountHolderName;
    
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName =accountHolderName ;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public void display(){
        System.out.printf("Account Holder Name : %s%n", getAccountHolderName());
        System.out.printf("Account Number : %s%n", getAccountNumber());
        System.out.printf("balance: %.2f%n", getBalance());
    }    
}
 