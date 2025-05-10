package core.basesyntax.figure;

import core.basesyntax.supplier.Color;

public class RightTriangle extends Figure {
    private double sideLength;

    public RightTriangle(Color color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double calculateArea() {
        return (Math.pow(this.sideLength, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public String draw() {
        return "Figure: " + getClass().getSimpleName() + ", area: " + calculateArea()
                + " sq. units, sideLength: " + sideLength
                + " units, color: " + getColor().name();
    }
}
