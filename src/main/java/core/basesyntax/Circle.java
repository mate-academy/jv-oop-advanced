package org.example;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private int radius;
    private static DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Shape: circle, area: " + decimalFormat.format(area()) + "sq. units, radius: " + radius
                + " sq. units, color: " + getColor());
    }
}
