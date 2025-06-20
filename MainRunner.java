/*
 * Purpose: Acts as the main entry point to run the ATM simulation.
 * Registers users.
 * Creates accounts.
 * Performs deposits and withdrawals.
 * Logs transactions.
 * Displays final balances and transaction history.
 */
package Collections;

public class MainRunner {
    public static void main(String[] args) {
        ATMUsers users = new ATMUsers();
        users.registerUser("Alice");
        users.registerUser("Bob");
        users.showUsers();

        AccountManager manager = new AccountManager();
        manager.createAccount("Alice", 1000);
        manager.createAccount("Bob", 500);

        TransactionHistory history = new TransactionHistory();

        manager.deposit("Alice", 200);
        history.addTransaction("Alice deposited ₹200");

        manager.withdraw("Bob", 100);
        history.addTransaction("Bob withdrew ₹100");

        manager.showBalance("Alice");
        manager.showBalance("Bob");

        history.showTransactions();
    }
}
/*
 
 */

