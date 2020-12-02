package core.basesyntax.figure.figures;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.Shape;

public class Circle extends Figure {

    public static final Shape NAME = Shape.CIRCLE;
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("     ##     ");
        System.out.println("  #      #  ");
        System.out.println(" #         #");
        System.out.println("  #      #  ");
        System.out.println("     ##     ");
    }

    @Override
    public double getSquare() {
        return (int) (Math.PI * radius * radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return getColor() + " " + NAME
                + " with radius " + getRadius() + " units"
                + " and square " + getSquare() + " sq. units.";
    }
}
