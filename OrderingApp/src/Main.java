public class Main {

    public static void main(String[] args) {

        Order order = new Order();
        order.getOrderPrinted();

        Order order2 = new Order("House burger", 3.99, "Sprite", Size.MEDIUM, Size.LARGE);

        order2.addBurgerTopping("Chicken");

        String[] toppings = {"Mayo", "Bacon"};

        order2.addBurgerTopping(toppings);

        order2.getOrderPrinted();

        String[] deluxeOrder = {"Chicken", "Jalapeno", "Bacon", "Mayo", "Tomato"};

        Order order3 = new Order(deluxeOrder, "Lemonade");

        order3.getOrderPrinted();

    }
}
