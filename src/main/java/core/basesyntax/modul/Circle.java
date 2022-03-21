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
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle"
                + ", area: " + getArea()
                + ", radius: " + this.radius
                + ", color: " + getColor());
    }
}
