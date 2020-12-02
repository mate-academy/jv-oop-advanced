package core.basesyntax.figure.figures;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.Shape;

import javax.print.attribute.standard.MediaSize;

public class Circle extends Figure {

    private double radius;
    public static final Shape NAME = Shape.CIRCLE;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return getColor() + " " + NAME
                + " with radius " + getRadius()
                + " and square " + getSquare();
    }
}
