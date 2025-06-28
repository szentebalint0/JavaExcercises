public class Main {

    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();

        SmartKitchen kitchen = new SmartKitchen();

        kitchen.pourMilk();
        kitchen.addWater();
        kitchen.loadDishwasher();

        kitchen.setKitchenState(false,true,true);

        kitchen.doKitchenWork();

    }

}
