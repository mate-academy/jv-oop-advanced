package core.basesyntax.figures;

import core.basesyntax.utils.Color;

public class Circle extends Figure {

    private double radius;

    public Circle() {
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(double area, Color color) {
        super(area, color);
    }

    public Circle(double area, Color color, double radius) {
        super(area, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculate() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + (double) Math.round(calculate() * 10) / 10
                + " sq. units, " + "radius: " + (int) radius
                + " units, color: " + getColor().toString().toLowerCase());
    }
}
