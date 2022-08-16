package core.basesyntax.figures.impl;

import core.basesyntax.figures.Figure;

public class Circle extends Figure {
    public static final String NAME = "circle";
    private static final double PI = 3.14;
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + NAME + ", area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
