package com.szentebalint;

public class River extends Line{

    public River(String name, double x, double y) {
        super(name, x, y);
    }

    @Override
    public void render() {

        StringBuilder sb = new StringBuilder();

        for (double[] coordinates : coordinates) {
            sb.append("[").append(coordinates[0]).append(", ").append(coordinates[1]).append("]");
        }

        System.out.println("Render " + this.name + " as " + this.getClass().getSuperclass().getSimpleName().toUpperCase() + "([" + sb + "])");
    }

}
