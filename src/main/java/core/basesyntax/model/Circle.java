package core.basesyntax.model;

import core.basesyntax.enums.Color;
import core.basesyntax.service.AreaCalculator;
import core.basesyntax.service.Drawable;

public class Circle extends Figure implements AreaCalculator, Drawable {

    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, radius);
    }

    @Override
    public void draw() {
        toString();
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + calculateArea() + " sq.units, " + "radius: " + radius
                + " sq.units," + " color: " + super.getColor();
    }
}
