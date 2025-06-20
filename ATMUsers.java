/*
 * Purpose: Manages unique ATM users.
 * Collection Used: HashSet<String>
 * registerUser(String username): Adds a user if not already registered.
 * showUsers(): Displays all registered users.
 */
package Collections;

import java.util.*;

public class ATMUsers {
    private Set<String> users = new HashSet<>();

    public void registerUser(String username) {
        if (users.add(username)) {
            System.out.println("User '" + username + "' registered.");
        } else {
            System.out.println("User '" + username + "' already exists.");
        }
    }

    public void showUsers() {
        System.out.println("Registered Users: " + users);
    }
}
