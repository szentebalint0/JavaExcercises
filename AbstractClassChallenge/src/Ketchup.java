public class Ketchup extends ProductsForSale{

    public Ketchup() {
        this.price = 1.99;
        this.type = "sauce";
    }

    @Override
    void showDetails() {
        System.out.println("Ketchup is a tasty red sauce");
    }
}
