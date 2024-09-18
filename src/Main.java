public class Main {
    public static void main(String[] args) {
        // Create a new bank account with an initial balance
        BankAccount userAccount = new BankAccount(000.0);

        // Create an ATM instance and pass the user's bank account to it
        ATM atm = new ATM(userAccount);

        // Show the ATM menu to the user
        atm.showMenu();
    }
}
