public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String model) {
        super(model);
    }



    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("It consumes petrol");
    }
}
