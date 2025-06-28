public class KitchenObject {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }
}

class Refrigerator extends KitchenObject {
    public void orderFood(){
        if(this.isHasWorkToDo()) System.out.println("Ordering Food...");
    }
}

class DishWasher extends KitchenObject {
    public void doDishes(){
        if(this.isHasWorkToDo()) System.out.println("Washing Dishes...");
    }
}

class CoffeeMaker extends KitchenObject {
    public void brewCoffee(){
        if(this.isHasWorkToDo()) System.out.println("Brewing Coffee...");
    }
}
