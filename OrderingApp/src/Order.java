public class Order {
    private Burger burger;
    private Drink drink;
    private Fries fries;
    private double price;
    private int currentOrderNumber = orderNumber;

    private static int orderNumber = 1;

    //creating a default meal with no arguments
    public Order() {
        this.burger = new Burger("Plain Cheeseburger", 2.99);
        this.drink = new Drink("Coke", Size.SMALL);
        this.fries = new Fries("French Fries", Size.SMALL);
    }

    //making a custom order
    public Order(String burgerName, double burgerPrice, String drinkName, Size drinkSize, Size friesSize) {
        this.burger = new Burger(burgerName, burgerPrice);
        this.drink = new Drink(drinkName, drinkSize);
        this.fries = new Fries("French Fries", friesSize);
    }

    //making a deluxe custom toppings order, 5 free toppings, large drink and fries included in the burger price
    public Order(String[] toppings, String drinkName) {
        this.burger = new DeluxeBurger();
        addBurgerTopping(toppings);
        this.drink = new Drink(drinkName, Size.LARGE);
        this.fries = new Fries("French Fries", Size.LARGE);
        this.price = burger.getPrice();
    }

    private void addPrices()
    {
        this.price = this.burger.getPrice() + this.drink.getPrice() + this.fries.getPrice() + this.burger.getToppingPrice();
    }

    public void addBurgerTopping(String name){
        this.burger.addTopping(name);
    }

    public void addBurgerTopping(String[] toppings){

        for(int i = 0; i < toppings.length; i++){
            this.burger.addTopping(toppings[i]);
        }

    }

    public void getOrderPrinted(){

        System.out.println("Your order #"+currentOrderNumber+" has been printed.");
        orderNumber++;
        System.out.println(burger);
        if (!(burger instanceof DeluxeBurger)){
            addPrices();
            System.out.println(drink);
            System.out.println(fries);
        }
        System.out.println("-".repeat(30));
        System.out.println("Total: $" + price + "\n\n");
    }
}
