import wallet.Wallet;
import ledger.Ledger;
import admin.Admin;

public class Main {
    public static void main(String[] args) {
        Wallet w = new Wallet();
        Ledger l = new Ledger();
        Admin a = new Admin();

        // Create users
        w.createUser("Alice", 1000);
        w.createUser("Bob", 500);

        // Show balances
        w.viewBalance("Alice");
        w.viewBalance("Bob");

        // Transactions
        l.recordTransaction("Alice deposits 500");
        w.updateBalance("Alice", 500);

        l.recordTransaction("Bob withdraws 200");
        w.updateBalance("Bob", -200);

        // Show updated balances
        w.viewBalance("Alice");
        w.viewBalance("Bob");

        // Ledger and admin view
        l.showTransactions();
        a.viewAllTransactions(l.transactions);
    }
}
