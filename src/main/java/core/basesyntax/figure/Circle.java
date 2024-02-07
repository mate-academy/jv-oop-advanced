package core.basesyntax.figure;

import core.basesyntax.color.Color;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public Circle(Color color, double radius) {
        this.color = color.name().toLowerCase();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        String str = "Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + ", color: " + color;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
