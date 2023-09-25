package core.basesyntax.figures;

import core.basesyntax.model.Figure;

public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.1f sq.units, radius: %.1f units, color: %s%n",
                calculateArea(), this.getRadius(), this.getColor());
    }
}
