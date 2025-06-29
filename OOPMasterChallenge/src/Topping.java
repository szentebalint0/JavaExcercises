public class Topping {
    private String name;
    private static double price = 0.5;

    public Topping(String name) {
        this.name = name;

    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                '}';
    }
}
