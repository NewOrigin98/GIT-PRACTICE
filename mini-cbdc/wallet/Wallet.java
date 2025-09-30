package wallet;

import java.util.HashMap;

public class Wallet {
    private HashMap<String, Double> users = new HashMap<>();

    public void createUser(String username, double initialBalance) {
        users.put(username, initialBalance);
        System.out.println("User " + username + " created with balance " + initialBalance);
    }

    public void viewBalance(String username) {
        System.out.println(username + " balance: " + users.getOrDefault(username, 0.0));
    }

    public void updateBalance(String username, double amount) {
        users.put(username, users.getOrDefault(username, 0.0) + amount);
        System.out.println(username + " balance updated: " + users.get(username));
    }

    public HashMap<String, Double> getUsers() {
        return users;
    }
}
