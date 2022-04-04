package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;

public class Circle extends Figure {
    private final int radius;

    public Circle(String name, String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, Color: " + getColor()
                + ", Radius: " + radius
                + ", Area: " + getArea() + ".");
    }
}
