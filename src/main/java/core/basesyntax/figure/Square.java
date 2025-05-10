package core.basesyntax.figure;

import core.basesyntax.supplier.Color;

public class Square extends Figure {
    private double sideLength;

    public Square(Color color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double calculateArea() {
        return this.sideLength * this.sideLength;
    }

    @Override
    public String draw() {
        return "Figure: " + getClass().getSimpleName() + ", area: " + calculateArea()
                + " sq. units, sideLength: " + sideLength
                + " units, color: " + getColor().name();
    }
}
