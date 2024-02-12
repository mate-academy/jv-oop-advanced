package core.basesyntax.figure;

import core.basesyntax.supplier.Color;

public class IsoscelesTrapezoid extends Figure {
    private Color color;
    private double firstSideLength;
    private double secondSideLength;

    public IsoscelesTrapezoid(Color color) {
        this.color = color;
    }

    public IsoscelesTrapezoid(double firstSideLength, double secondSideLength) {
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }

    public IsoscelesTrapezoid(Color color, double firstSideLength, double secondSideLength) {
        this.color = color;
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }

    public Color getColor() {
        return color;
    }

    public double getFirstSideLength() {
        return firstSideLength;
    }

    public double getSecondSideLength() {
        return secondSideLength;
    }

    @Override
    public double calculateArea() {
        return this.firstSideLength * this.secondSideLength;
    }

    @Override
    public String draw() {
        return "Figure: " + getClass().getSimpleName() + ", area: " + calculateArea()
                + " sq. units, firstSideLength: "
                + firstSideLength + " units, secondSideLength: "
                + secondSideLength + " units, color: " + color.name();
    }
}
