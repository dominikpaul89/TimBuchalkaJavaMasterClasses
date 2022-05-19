package pl.click;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(3214213,222,"bobi","dasdsa@dassda.pl",32413412 );
        System.out.println("Empty construction called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber){
        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }
    public void withdraw(double withdrawAmount) {


        if (balance -withdrawAmount <= 0 ){
            System.out.println("Only "+balance+" available. Withdraw not processed");
        }else {
            this.balance -= withdrawAmount;
            System.out.println("Withdraw of "+withdrawAmount+" processed. Remaining balance is "+balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


