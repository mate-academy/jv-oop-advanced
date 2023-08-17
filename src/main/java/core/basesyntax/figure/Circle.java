package core.basesyntax.figure;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * Math.PI;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, "
                + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor());
    }
}
