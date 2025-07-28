import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double x) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(x);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double x) {
        this.transactions.add(x);
    }

}
