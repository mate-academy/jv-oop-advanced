package core.basesyntax.modul;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public void toDraw(double area) {
        System.out.println("Figure: circle"
                + ", area: " + area
                + ", radius: " + this.radius
                + ", color: " + getColor());
    }
}
