public abstract class ProductsForSale {

    protected String type;
    protected double price;
    protected String description;

    public void printPricedItem(int quantity){

        System.out.println(this.type + "*" + quantity + "= $" + this.price * quantity );

    }

    public double getPrice() {
        return price;
    }

    abstract void showDetails();
}
