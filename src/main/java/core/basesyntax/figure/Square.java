package core.basesyntax.figure;

import core.basesyntax.supplier.Color;

public class Square extends Figure {
    private Color color;
    private double sideLength;

    public Square(Color color) {
        this.color = color;
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public Square(Color color, double sideLength) {
        this.color = color;
        this.sideLength = sideLength;
    }

    public Color getColor() {
        return color;
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
                + " units, color: " + color.name();
    }
}
