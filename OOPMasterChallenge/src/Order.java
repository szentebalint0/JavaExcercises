public class Order {
    private Burger burger;
    private Drink drink;
    private Fries fries;

    private double price;

    public Order() { //creating a default meal with no arguments
        this.burger = new Burger("Plain Cheeseburger", 2.99);
        this.drink = new Drink("Coke", Size.SMALL);
        this.fries = new Fries("French Fries", Size.SMALL);

        addPrices();
    }

    //making a custom order
    public Order(String burgerName, double burgerPrice, String drinkName, Size drinkSize, Size friesSize) {
        this.burger = new Burger(burgerName, burgerPrice);
        this.drink = new Drink(drinkName, drinkSize);
        this.fries = new Fries("French Fries", friesSize);

       addPrices();
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
        this.price += this.burger.getPrice();
        this.price += this.drink.getPrice();
        this.price += this.fries.getPrice();
    }
    public void addBurgerTopping(String name){
        this.price -= this.burger.getPrice();
        this.burger.addTopping(name);
        this.price += this.burger.getPrice();
    }

    public void addBurgerTopping(String[] toppings){

        for(int i = 0; i < toppings.length; i++){
            this.burger.addTopping(toppings[i]);
        }

    }

    public void getOrderPrinted(){
        System.out.println("Your order has been printed: ");
        System.out.println(burger);
        if (!(burger instanceof DeluxeBurger)){
            System.out.println(drink);
            System.out.println(fries);
        }
        System.out.println("-".repeat(30));
        System.out.println("Total: $" + price + "\n\n");
    }
}
