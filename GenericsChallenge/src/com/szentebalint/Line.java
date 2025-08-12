package com.szentebalint;

import java.util.ArrayList;
import java.util.List;

public abstract class Line implements Mappable {


    protected String name;
    protected List<double[]> coordinates;

    public Line(String name, double x, double y) {
        this.name = name;
        this.coordinates = new ArrayList<>();
        this.coordinates.add(new double[]{x, y});
    }

    public void addCoordinate(double x, double y) {
        this.coordinates.add(new double[]{x, y});
    }


}
