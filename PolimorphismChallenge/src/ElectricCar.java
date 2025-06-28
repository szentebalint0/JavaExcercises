public class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String model){
        super(model);
    }


    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("It consumes electricity");
    }
}
