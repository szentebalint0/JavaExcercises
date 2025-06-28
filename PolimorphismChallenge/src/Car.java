public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public static Car createCar(String type, String model) {

        return switch (type){
            case "Gas" -> new GasPoweredCar(model);
            case "Electric" -> new ElectricCar(model);
            case "Hybrid" -> new HybridCar(model);
            default -> new Car(model);
        };

    }

    public void startEngine(){
        System.out.println("The " + this.getClass().getSimpleName() + "'s Engine is starting");
    }

    public void drive(){
        System.out.println("The " + this.getClass().getSimpleName() + " is driving");
    }

    protected void runEngine(){
        System.out.println("The " + this.getClass().getSimpleName() + "'s Engine is running");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
