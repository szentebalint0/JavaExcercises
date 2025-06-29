public class Main {

    public static void main(String[] args) {

        Order order = new Order();
        System.out.println(order);
        order.addBurgerTopping("Chicken");
        order.addBurgerTopping("Jalapeno");
        order.addBurgerTopping("Bacon");
        order.addBurgerTopping("Pepsi");
        System.out.println(order);
        System.out.println("The final price of the order is $" + order.getPrice());

        Order order2 = new Order("House burger", 3.99, "Sprite", Size.MEDIUM, Size.LARGE);
        System.out.println(order2);

        order2.addBurgerTopping("Chicken");
        System.out.println(order2);
        System.out.println("The final price of the order is $" + order2.getPrice());

        String[] deluxeOrder = {"Chicken", "Jalapeno", "Bacon", "Mayo", "Tomato", "Pepsi"};

        Order order3 = new Order(deluxeOrder, "Lemonade");
        System.out.println(order3);
        System.out.println("The final price of the order is $" + order3.getPrice());

    }
}
