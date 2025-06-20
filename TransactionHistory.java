/*
 * Purpose: Keeps a record of all transactions (deposits, withdrawals).
 * Collection Used: ArrayList<String>
 * addTransaction(String detail): Adds a transaction description to the list.
 * showTransactions(): Displays all recorded transactions.
*/
package Collections;

import java.util.*;

public class TransactionHistory {
    private List<String> transactions = new ArrayList<>();

    public void addTransaction(String detail) {
        transactions.add(detail);
    }

    public void showTransactions() {
        System.out.println("Transaction History:");
        for (String t : transactions) {
            System.out.println("- " + t);
        }
    }
}
