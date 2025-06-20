/*
 * Purpose: Manages user accounts and balances.
 * Collection Used: HashMap<String, Integer>
 * createAccount(String user, int initialBalance): Creates a new account.
 * deposit(String user, int amount): Adds money to a user’s account.
 * withdraw(String user, int amount): Deducts money if balance is sufficient.
 * showBalance(String user): Displays the current balance.
 */
package Collections;

import java.util.*;

public class AccountManager {
    private Map<String, Integer> accounts = new HashMap<>();

    public void createAccount(String user, int initialBalance) {
        accounts.put(user, initialBalance);
        System.out.println("Account created for " + user + " with balance ₹" + initialBalance);
    }

    public void deposit(String user, int amount) {
        accounts.put(user, accounts.get(user) + amount);
        System.out.println("Deposited ₹" + amount + " to " + user + "'s account.");
    }

    public void withdraw(String user, int amount) {
        int balance = accounts.get(user);
        if (amount > balance) {
            System.out.println("Insufficient funds for " + user);
        } else {
            accounts.put(user, balance - amount);
            System.out.println("Withdrew ₹" + amount + " from " + user + "'s account.");
        }
    }

    public void showBalance(String user) {
        System.out.println(user + "'s Balance: ₹" + accounts.get(user));
    }
}

