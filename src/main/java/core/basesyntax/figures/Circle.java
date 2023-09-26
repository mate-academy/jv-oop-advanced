package core.basesyntax.figures;

import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        super.setColor(color);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor());
    }
}
