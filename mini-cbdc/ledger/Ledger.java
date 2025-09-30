package ledger;

import java.util.ArrayList;
import java.util.List;

public class Ledger {
    public List<String> transactions = new ArrayList<>();

    public void recordTransaction(String transaction) {
        transactions.add(transaction);
        System.out.println("Transaction recorded: " + transaction);
    }

    public void showTransactions() {
        System.out.println("All transactions:");
        for(String t : transactions) {
            System.out.println(t);
        }
    }
}
