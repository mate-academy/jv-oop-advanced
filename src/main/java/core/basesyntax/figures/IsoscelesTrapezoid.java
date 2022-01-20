package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double sideOne;
    private double sideTwo;
    private double height;

    public IsoscelesTrapezoid(double sideOne, double sideTwo, double height) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (height * Math.sqrt(sideOne * sideTwo));
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, "
                + " area: " + getArea() + " sq.units,"
                + " side one: " + sideOne + " units,"
                + " side two: " + sideTwo + " units,"
                + " height: " + height + " units,"
                + " color: " + super.getColor();
    }
}
