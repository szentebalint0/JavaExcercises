package com.szentebalint;

public abstract class Point implements Mappable {

    protected String name;
    protected double x;
    protected double y;
    protected double[] coordinates;

    public Point(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

}
