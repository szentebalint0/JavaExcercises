public class Drink {

    private String name;
    private double price;
    private Size size;

    public Drink(String name, Size size) {
        this.name = name;
        this.size = size;
        this.price = switch (size){
            case SMALL -> 1.59;
            case MEDIUM -> 2.09;
            case LARGE -> 2.99;
        };
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + size + " $" + price;
    }
}
