import java.util.ArrayList;
import java.util.List;

public class Burger {

    private String name;
    private double price;
    protected List<Topping> toppings;
    private double toppingPrice;

    public Burger(String name, double price) {
        this.name = name;
        this.price = price;
        this.toppings = new ArrayList<Topping>();
    }

    public void addTopping(String name) {
        if (this.toppings.size() < 3) {
            Topping topping = new Topping(name);
            this.toppings.add(topping);
            this.toppingPrice += topping.getPrice();

        }
        else {
            System.out.println("Maximum number of toppings is 3!\n");
        }

    }

    public double getPrice() {
        return price;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }

    @Override
    public String toString() {
        String returnString = name + " " + price + "$";

        if (!toppings.isEmpty()) {
            for (int i = 0; i<this.toppings.size(); i++) {

                returnString += "\n"+ this.toppings.get(i).getName() + " $" +  this.toppings.get(i).getPrice();

            }
        }
        return returnString;
    }
}
