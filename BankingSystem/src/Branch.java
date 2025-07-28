import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransactionAmount) {

        Customer newCustomer = new Customer(name, initialTransactionAmount);

        if (customers.contains(newCustomer)) {
            return false;
        }

        this.customers.add(newCustomer);
        return true;

    }

    public boolean addCustomerTransaction(String customerName, double Transaction) {

        if (findCustomer(customerName) != null) {
            findCustomer(customerName).addTransaction(Transaction);
            return true;
        }

        return false;

    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
