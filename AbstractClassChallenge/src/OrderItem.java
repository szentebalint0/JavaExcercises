public record OrderItem(int quantity, ProductsForSale product) {

    public OrderItem {
        System.out.println("Ordered" + quantity + this.product().getClass().getSimpleName() + "at $" + this.product().getPrice() * quantity);
    }
}
