package core.basesyntax.figure;

import core.basesyntax.supplier.Color;

public class IsoscelesTrapezoid extends Figure {
    private double firstSideLength;
    private double secondSideLength;

    public IsoscelesTrapezoid(Color color, double firstSideLength, double secondSideLength) {
        super(color);
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
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
                + secondSideLength + " units, color: " + getColor().name();
    }
}
