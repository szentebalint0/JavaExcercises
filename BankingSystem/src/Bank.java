import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {

        if (findBranch(branchName) != null) {
            return false;
        }

        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initTransacton) {

        if (findBranch(branchName) != null) {
            findBranch(branchName).newCustomer(customerName, initTransacton);
            return true;
        }
        return false;

    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {

        if (findBranch(branchName) != null) {
            findBranch(branchName).addCustomerTransaction(customerName, amount);
            return true;
        }
        return false;

    }

    public boolean listCustomers(String branchName) {

        if (findBranch(branchName) != null) {

            System.out.println("Customer details fr branch " + branchName);

            ArrayList<Customer> customers = findBranch(branchName).getCustomers();

            for (int i = 1; i <= customers.size(); i++) {

                System.out.println("Customer: " + customers.get(i - 1).getName() + "[" + i + "]");
                System.out.println("Transactions");
                for (int j = 1; j <= customers.get(i - 1).getTransactions().size(); j++) {
                    System.out.println("[" + j + "] Amount " + customers.get(i - 1).getTransactions().get(j));
                }

            }

            return true;
        }

        return false;
    }

    private Branch findBranch(String branchName) {

        for (Branch branch : branches) {
            if (branch.getName().equalsIgnoreCase(branchName)) {
                return branch;
            }

        }

        return null;
    }
}
