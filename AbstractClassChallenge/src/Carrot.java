public class Carrot extends ProductsForSale{

    public Carrot() {
        this.price = 0.35;
        this.type = "vegetable";
    }

    @Override
    void showDetails() {
        System.out.println("Carrot is orange sometimes");
    }

}
