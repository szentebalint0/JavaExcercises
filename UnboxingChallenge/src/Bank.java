import java.util.ArrayList;

public class Bank {

    private final String name;
    private final ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    private Customer findCustomerByName(String name) {
        for (Customer customer : this.customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;

    }

    public void addCustomer(String name, double initialAmount) {

        Customer customer = new Customer(name, initialAmount);

        if (findCustomerByName(customer.getName()) == null){
            this.customers.add(customer);
            return;
        }
        System.out.println("Customer with name " + name + " already exists!");
    }


    public void addTransaction(String name, double amount){

        if (findCustomerByName(name) != null){
            findCustomerByName(name).addTransaction(amount);
        }



    }

    public void printInformation(){

        for (Customer customer : this.customers) {
            System.out.println("Customer: " + customer.getName());
            for (Double  amount : customer.getTransactions()) {
                System.out.println("$" + amount);
            }
        }

    }

}
