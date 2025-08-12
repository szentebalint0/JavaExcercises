package com.szentebalint;

import java.util.Arrays;

public class Mall extends Point {

    public Mall(String name, double x, double y) {
        super(name, x, y);
    }

    @Override
    public void render() {
        this.coordinates = new double[]{this.x, this.y};
        System.out.println("Render " + this.name + " as " + this.getClass().getSuperclass().getSimpleName().toUpperCase() + "([" + Arrays.toString(coordinates) + "])");
    }
}
