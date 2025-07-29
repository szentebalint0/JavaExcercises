import java.util.ArrayList;

public class Store {

    private ArrayList<ProductsForSale> productsForSale;

    public Store() {
        productsForSale = new ArrayList<>();
    }

    private void addItemToOrder(ProductsForSale product){
        productsForSale.add(product);
    }

    private void printOrder(){

        for(ProductsForSale p : productsForSale){
            System.out.println(p.getClass().getSimpleName() + " $" + p.getPrice());
        }

    }

    public static void main(String[] args) {

        Store store = new Store();
        store.addItemToOrder(new Carrot());
        store.addItemToOrder(new Ementali());
        store.addItemToOrder(new Ketchup());
        store.printOrder();



    }

}
