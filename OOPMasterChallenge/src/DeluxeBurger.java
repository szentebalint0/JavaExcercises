public class DeluxeBurger extends Burger{
    public DeluxeBurger() {
        super("Deluxe Burger", 10.99);
    }

    @Override
    public void addTopping(String name) {
        if (this.toppings.size() < 5) {
            Topping topping = new Topping(name);
            this.toppings.add(topping);
        }
        else {
            System.out.println("Maximum number of toppings is 5!\n\n");
        }
    }

    @Override
    public String toString() {
        return "Deluxe Burger $" + getPrice() ;
    }
}
