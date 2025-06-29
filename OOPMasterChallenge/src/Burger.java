import java.util.ArrayList;
import java.util.List;

public class Burger {

    private String name;
    private double price;
    protected List<Topping> toppings;

    public Burger(String name, double price) {
        this.name = name;
        this.price = price;
        this.toppings = new ArrayList<Topping>();
    }

    public void addTopping(String name) {
        if (this.toppings.size() < 3) {
            Topping topping = new Topping(name);
            this.price += topping.getPrice();
            this.toppings.add(topping);

        }
        else {
            System.out.println("Maximum number of toppings is 3!");
        }

    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", toppings=" + toppings +
                '}';
    }
}
