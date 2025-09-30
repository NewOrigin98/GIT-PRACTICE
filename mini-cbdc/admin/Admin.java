package admin;

import java.util.List;

public class Admin {
    public void viewAllTransactions(List<String> transactions) {
        System.out.println("Admin view: All transactions");
        for(String t : transactions) {
            System.out.println(t);
        }
    }
}
