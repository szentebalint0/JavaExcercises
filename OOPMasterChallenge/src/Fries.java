public class Fries {

    private String itemName;
    private Size size;
    private double price;

    public Fries(String itemName, Size size) {
        this.itemName = itemName;
        this.size = size;
        this.price = switch (size){
            case SMALL -> 0.99;
            case MEDIUM -> 1.59;
            case LARGE -> 2.19;
        };
    }

    public String getItemName() {
        return itemName;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Fries{" +
                "itemName='" + itemName + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
