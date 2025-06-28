public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }


    public void addWater(){

        brewMaster.setHasWorkToDo(true);

    }

    public void pourMilk(){

        iceBox.setHasWorkToDo(true);

    }

    public void loadDishwasher(){

        dishWasher.setHasWorkToDo(true);

    }

    public void setKitchenState(boolean brewMaster, boolean dishWasher, boolean iceBox){
        this.brewMaster.setHasWorkToDo(brewMaster);
        this.dishWasher.setHasWorkToDo(dishWasher);
        this.iceBox.setHasWorkToDo(iceBox);
    }

    public void doKitchenWork(){

        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();

    }

}
