package core.basesyntax;

import auxiliary.Figure;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        super.setRandomColor();
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return Math.round((sideA * sideB) * 100.0) / 100.0;
    }

    public String toString() {
        return "Figure: Rectangle, "
                + "area: " + getArea() + " sq.units, "
                + "side_a: " + sideA + " units, "
                + "side_b: " + sideB + "  "
                + "color: " + getColor();
    }

}
