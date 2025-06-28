public class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String model){
        super(model);
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("It consumes petrol and electricity");
    }
}
