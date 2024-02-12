package core.basesyntax.figure;

import core.basesyntax.supplier.Color;

public class RightTriangle extends Figure {
    private Color color;
    private double sideLength;

    public RightTriangle(Color color) {
        this.color = color;
    }

    public RightTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    public RightTriangle(Color color, double sideLength) {
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
        return (Math.pow(this.sideLength, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public String draw() {
        return "Figure: " + getClass().getSimpleName() + ", area: " + calculateArea()
                + " sq. units, sideLength: " + sideLength
                + " units, color: " + color.name();
    }
}
