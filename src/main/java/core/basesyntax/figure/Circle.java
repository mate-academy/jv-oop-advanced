package core.basesyntax.figure;

import core.basesyntax.template.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}
