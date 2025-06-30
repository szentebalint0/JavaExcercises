public class Topping {
    private String name;
    private double price;

    public Topping(String name) {
        this.name = name;
        this.price = switch (name.toLowerCase()){
            case "mayo", "ketchup", "mustard" -> 0.25;
            case "pickles", "onion", "red onion", "tomato" -> 0.35;
            case "bacon", "ham", "salami", "chicken", "patty" -> 1.0;
            default -> 0;
        };
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
