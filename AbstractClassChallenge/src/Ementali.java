public class Ementali extends ProductsForSale{

    public Ementali() {
        this.price = 2.49;
        this.type = "cheese";
    }

    @Override
    void showDetails() {
        System.out.println("Ementali is a cheese type");
    }
}
