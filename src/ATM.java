import java.util.Scanner;

public class ATM {
    private BankAccount bankAccount;

    // Constructor
    public ATM(BankAccount account) {
        this.bankAccount = account;
    }

    // Method to display the ATM menu
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Your balance is: $" + bankAccount.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    bankAccount.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (option != 4);

        scanner.close();
    }
}
