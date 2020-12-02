package core.basesyntax.figure.figures;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;

public class Circle extends Figure {

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
        return getColor() + " " + getClass().getSimpleName()
                + " with radius " + getRadius() + " units"
                + " and square " + getSquare() + " sq. units.";
    }
}
