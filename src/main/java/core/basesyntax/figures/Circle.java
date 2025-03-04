package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = round(radius);
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius
                + " units, color: " + color);
    }

    private double round(double value) {
        return Math.round(value * 10.0) / 10.0;
    }
}
