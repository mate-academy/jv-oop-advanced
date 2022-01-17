package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, "
                + " area: " + getArea() + " sq.units,"
                + " side one: " + sideOne + " units,"
                + " side two: " + sideTwo + " units,"
                + " color: " + super.getColor();
    }
}
