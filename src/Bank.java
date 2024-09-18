import java.util.HashMap;

public class Bank {
    private HashMap<String, BankAccount> accounts;

    public Bank(){
        accounts=new HashMap<>();
    }

    public void createAccount(String accountNumber, String accountHolderName) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists.");
        } else {
            BankAccount newAccount = new BankAccount(accountNumber, accountHolderName);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account created successfully.");
        }
    }

    public void deleteAccount(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            accounts.remove(accountNumber);
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("Account does not exist.");
        }
    }

    public void deposit(String accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Balance: " );
            account.checkBalance();
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkAccountDetails(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.getAccountDetails();
        } else {
            System.out.println("Account not found.");
        }
    }    
}