public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName){
        accountNumber=this.accountNumber;
        accountHolderName=this.accountHolderName;
        balance=0;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        }
        else{
            System.out.println("Unexpected error occur while depositing." + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Available balance : "  + balance);
    }

    public void getAccountDetails() {
        System.out.println("Account holder's name : " + accountHolderName);
        System.out.println("Account number : " + accountNumber);
        System.out.println("Available balance : "  + balance);
    }    
}
