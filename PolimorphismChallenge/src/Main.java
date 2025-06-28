public class Main {

    public static void main(String[] args) {
        var car = Car.createCar("Gas", "Lamborghini Urus");
        var car2 = Car.createCar("Electric", "Tesla X");
        var car3 = Car.createCar("Hybrid", "Toyota Prius");
        var car4 = Car.createCar("Hydrogen", "Random Hydrogen Car");

        car.startEngine();
        System.out.println(car2.getClass().getSimpleName());
        car3.runEngine();
        car4.runEngine();


    }

}
