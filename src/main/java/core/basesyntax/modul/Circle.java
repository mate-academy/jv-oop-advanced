package core.basesyntax.modul;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        setColor(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle"
                + ", area: " + getArea()
                + ", radius: " + radius
                + ", color: " + getColor());
    }
}
