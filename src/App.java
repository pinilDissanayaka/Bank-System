import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Bank bankSystem = new Bank();
        String accountNumber, accountHolderName;
        double amount;

        while (true) {
            System.out.println("\n--- E2C Bank Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Check Account Details");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.println("Create Bank Account.");
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    accountHolderName = scanner.nextLine();
                    bankSystem.createAccount(accountNumber, accountHolderName);
                    break;
                case 2:
                    System.out.println("Delete Bank Account.");
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    bankSystem.deleteAccount(accountNumber);
                    break;
                case 3:
                    System.out.println("Deposit Amount.");
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter Amount to Deposit: ");
                    amount = scanner.nextDouble();
                    bankSystem.deposit(accountNumber, amount);
                    break;
                case 4:
                    System.out.println("Withdraw Amount.");
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter Amount to Withdraw: ");
                    amount = scanner.nextDouble();
                    bankSystem.withdraw(accountNumber, amount);
                    break;
                case 5:
                    System.out.println("Check Balance.");
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    bankSystem.checkBalance(accountNumber);
                    break;
                case 6:
                    System.out.println("Check Account Details.");
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    bankSystem.checkAccountDetails(accountNumber);
                    break;
                case 7:
                    System.out.println("Thank you for using the E2C Bank Management System!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
